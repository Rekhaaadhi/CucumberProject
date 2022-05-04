package org.stepdefinition;

import org.apache.poi.openxml4j.opc.internal.unmarshallers.PackagePropertiesUnmarshaller;
import org.junit.Assert;
import org.pojoclasses.HomePagePojoClass;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseStepDefinition extends BaseClass {
	//public static HomePagePojoClass hp;
	@When("User should click on the basket icon")
	public void user_should_click_on_the_basket_icon() throws InterruptedException {
		HomePagePojoClass hp=new HomePagePojoClass();
		Thread.sleep(3000);
		btnClick(hp.getlinkBasket());
		//performMoveToElement(hp.getlinkBasket()));
	    
	}

	@Then("User should be navigated to the checkout\\/basket page")
	public void user_should_be_navigated_to_the_checkout_basket_page() {
	   Assert.assertTrue(pageUrl().contains("checkout/basket"));
	   System.out.println("Test case passed");
	}


}
