package org.stepdefinition;

import java.awt.AWTException;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojoclasses.HomePagePojoClass;
import org.pojoclasses.RegisterPagePojo;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegisterationStepDefinition extends BaseClass
{
	public static HomePagePojoClass hp;
	public static Actions a;
	public static RegisterPagePojo rp;
	@Given("User should launch the chrome and load the url and maximize")
	public void user_should_launch_the_chrome_and_load_the_url_and_maximize() throws InterruptedException {
//		launchChrome();
//		loadUrl("https://www.waterstones.com/");
//		winMax();
		hp = new HomePagePojoClass();
		Thread.sleep(3000);
		btnClick(hp.getBtnacceptCookie());		
	}

	@When("User should click on the Signin-Register link")
	public void user_should_click_on_the_Signin_Register_link() {
		
		btnClick(hp.getLinkSiginRegister());
	}

	@Then("User should be able to see the CREATE NEW ACCOUNT link")
	public void user_should_be_able_to_see_the_CREATE_NEW_ACCOUNT_link() throws InterruptedException {
		String createlinktext = hp.getLinkCreateNewAcnt().getText();
		Assert.assertTrue("Create new account link is present",createlinktext.contains("CREATE AN"));
		System.out.println("Testcase passed");
		//toQuit();
		
	}
	
	@When("User should click on the CREATE NEW ACCOUNT link")
	public void user_should_click_on_the_CREATE_NEW_ACCOUNT_link() throws InterruptedException {
		Thread.sleep(2000);
	    //btnClick(hp.getLinkCreateNewAcnt());
		a = new Actions(driver);
    	a.moveToElement(hp.getLinkCreateNewAcnt()).click().build().perform();
	    
	}

	@Then("User should be navigated to the Signin Page")
	public void user_should_be_navigated_to_the_Signin_Page() {
		String url = pageUrl();
		Assert.assertTrue("Navigated to Sigin page",url.contains("signin"));
		System.out.println("Test case passed");
		//toQuit();
	    
	}
	
	@When("User should click on the Register button in siginpage")
	public void user_should_click_on_the_Register_button_in_siginpage() {
		rp = new RegisterPagePojo();
		btnClick(rp.getBtnRegister());
	    
	}

	@Then("User should be navigated to the Registraion page")
	public void user_should_be_navigated_to_the_Registraion_page() {
		String linkregurl = pageUrl();
	    Assert.assertTrue("Navigated to Registeration page",linkregurl.contains("registration"));
	    System.out.println("Testcase passed");
	    //toQuit();
	}
	
	
	@Then("User can select only one value from the Title dropdown")
	public void user_can_select_only_one_value_from_the_Title_dropdown() {
		Select s = new Select(rp.getDrpdwnTitle());
		s.selectByVisibleText("Mr");
		if(!s.isMultiple()) {
			System.out.println("Test case passed");
			//toQuit();
		}
		
	   
	}
	@Then("User should be able enter values {string} to the firstname text box without any error")
	public void user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String vlname) throws AWTException {
		
		fill(rp.getfName(),vlname);
		performTab();
		if(rp.getfName().getAttribute("value").equals(vlname)) {
			System.out.println("Test case passed for value :"+vlname);
			//toQuit();
		}
		
	}
	
	
	@Then("User should pass the invalid lastname {string} and gets error")
	public void user_should_pass_the_invalid_lastname(String invlname) throws AWTException, InterruptedException {
		fill(rp.getlName(),invlname);
		boolean exception=true;
		performTab();
		Thread.sleep(2000);	
		try{
			String errmsg = rp.geterrlname().getText();
			//exception = true;
			System.out.println("Test case passed for value :" +invlname);				
		}
		
		catch(NoSuchElementException e){
			
			exception = false;
			System.out.println("Test case failed for the value :" +invlname);
			toQuit();
		}
		Assert.assertTrue(exception);
		//toQuit();

	}
	@Then("User should pass the valid lastname and should not get any error")
	public void user_should_pass_the_valid_lastname_and_should_not_get_any_error(io.cucumber.datatable.DataTable dt) throws AWTException, InterruptedException {
		int excep_count=0;
		List<String> vlnameList = dt.asList();
	    
	    //boolean exception=true;
	    for( String vlname : vlnameList)
	    {
	    	fill(rp.getlName(),vlname);
	    	performTab();
	    	
	    	Thread.sleep(2000);	
	    	try {
	    		String errmsg = rp.geterrlname().getText();
				if(errmsg.contains("Please") ||errmsg.contains("must be at least 2 char" ))
				{   
					System.out.println("Test case failed for the value "+vlname);
					excep_count++;
					driver.navigate().refresh();
				}
	    	}
	    	catch(NoSuchElementException e)
	    	{
	    		System.out.println("Test case passed for the value : " + vlname);
	    		//Assert.assertTrue(true);
				driver.navigate().refresh();
	    	}
	    }
	    if(excep_count>0) {
	    	//toQuit();
			Assert.assertTrue(false);
		}
		else {
			//toQuit();
			Assert.assertTrue(true);
		}	
    	
	    
	}

	
	@Then("User should pass the valid email ids")
	public void user_should_pass_the_valid_email_ids(io.cucumber.datatable.DataTable dt) throws AWTException {
		List<String> emailList = dt.asList();
		int excep_count=0;
		for (String email : emailList)
		{
			
			fill(rp.getEmail(),email);
			performTab();
			
			try {
				String errormsg = rp.geterrEmail().getText();
				if(errormsg.contains("enter a valid")) {
					System.out.println("Test case failed for the value : "+email);
					excep_count++;
					driver.navigate().refresh();
					
				 }
			}
	    	catch(NoSuchElementException e)
	    	{
	    		//e.printStackTrace();
				System.out.println("Test case passed for the value : " + email);
				driver.navigate().refresh();
			}
			
		}
		if(excep_count>0) {
	    	//toQuit();
			Assert.assertTrue(false);
		}
		else {
			//toQuit();
			Assert.assertTrue(true);
		}		
	}
	@Then("User should pass the invalid email ids and gets error message")
	public void user_should_pass_the_invalid_email_ids_and_gets_error_message(io.cucumber.datatable.DataTable dt) throws AWTException {
		List<String> emailList = dt.asList();
		int excep_count=0;
		for (String email : emailList)
		{
			
			fill(rp.getEmail(),email);
			performTab();
			
			try {
				String errormsg = rp.geterrEmail().getText();
				if(errormsg.contains("enter a valid")) {
					System.out.println("Test case passed for the value : "+email);					
					driver.navigate().refresh();
					
				 }
			}
	    	catch(NoSuchElementException e)
	    	{
	    		//e.printStackTrace();
	    		excep_count++;
				System.out.println("Test case failed for the value : " + email);
				driver.navigate().refresh();
			}
			
		}
		if(excep_count>0) {
	    	//toQuit();
			Assert.assertTrue(false);
		}
		else {
			//toQuit();
			Assert.assertTrue(true);
		}		
	}
	
	@Then("User should be able to enter exactly {int}charecters without any error")
	public void user_should_be_able_to_enter_exactly_charecters_without_any_error(Integer int1, io.cucumber.datatable.DataTable dt) throws AWTException {
		List<String> validpassList = dt.asList();
		int excep_count=0;
		for(String validpass : validpassList)
		{
			 fill(rp.getPswd(),validpass);
			 performTab();
			 try {
				 String errormsg = rp.getPswd().getText();
					if(errormsg.contains("enter a valid")) {
						excep_count++;
						System.out.println("Test case failed for the value : "+validpass);					
						driver.navigate().refresh();					
					 }
					
			 }
			 catch(NoSuchElementException e)
			 {
				 System.out.println("Test case passed for the value :"+validpass);
				 driver.navigate().refresh();
			 }
			 
		}
		if(excep_count>0)
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	    
	}
}


	
	