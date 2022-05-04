package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.pojoclasses.HomePagePojoClass;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductSearchStepDefinition extends BaseClass {
	public static HomePagePojoClass hp;
	@Given("User should pass the value to the search text box")
	public void user_should_pass_the_value_to_the_search_text_box(io.cucumber.datatable.DataTable dt) throws InterruptedException {
		Thread.sleep(3000);
	   hp=new HomePagePojoClass();
	   List<String> l = dt.asList();
	   fill(hp.gettxtSearch(),l.get(0));
	  
	   
	}

	@Given("User should click search button")
	public void user_should_click_search_button() {
		 btnClick(hp.getbtnSearch());
	}

	@Then("User should be navigated to the search url")
	public void user_should_be_navigated_to_the_search_url() throws InterruptedException {
		
		Thread.sleep(3000);
		Assert.assertTrue(pageUrl().contains("search"));
		System.out.println("Test case passed");
	
				
	}


}
