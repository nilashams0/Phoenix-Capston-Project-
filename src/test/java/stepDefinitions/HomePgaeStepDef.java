package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;

public class HomePgaeStepDef extends Base{
	
	HomePageObject homepage = new HomePageObject();
	
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
         homepage.clickOncurrency();
         logger.info("Clicked On Currency");
         

	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
         homepage.clickOnCurrenctEUR();
         logger.info("Clicked On EUR in Currency");

	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	    homepage.showOnCurrencyChangedtoEUR();
	    logger.info("Currency Changed to EUR");
	    try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	    @When("User click on Shopping Cart")
		public void user_click_on_shopping_cart() {
	    	homepage.clickOnshoppingCartButton();
		    logger.info("Clicked on Shopping Cart");
	    	
	    }
	    
	    @Then("Your shopping cart is empty!” message should display")
		public void your_shopping_cart_is_empty_message_should_display() {
	    	homepage.dropDowntextOpened();
		    logger.info("Your shopping cart is empty!” message should display");
		    try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    }
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
