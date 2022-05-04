package org.stepdefinition;

import org.junit.Assert;
import org.pojoclasses.HomePagePojoClass;
import org.utilities.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefinition extends BaseClass{
	
	//public static HomePagePojoClass hp;
	@When("User should click on the New link in the home page")
	public void user_should_click_on_the_New_link_in_the_home_page() throws InterruptedException {
		HomePagePojoClass hp=new HomePagePojoClass();
		Thread.sleep(2000);
	    btnClick(hp.getLinkNewBook());
	}

	@Then("User should be navigated to new-books page")
	public void user_should_be_navigated_to_new_books_page() {
	    String url = pageUrl();
	    Assert.assertTrue("Navigation Error", url.contains("new-books"));
	    System.out.println("Test case passed");
	}

}
