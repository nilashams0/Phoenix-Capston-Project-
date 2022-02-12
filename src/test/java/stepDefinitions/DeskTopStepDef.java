package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.sun.tools.javac.util.Log;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.Utilities;

public class DeskTopStepDef extends Base {

	DesktopPageObject desktop = new DesktopPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws Throwable {
		desktop.openBrowser();
		logger.info("WebSite validated successfully");
		Utilities.takeScreenShot("Test Environment");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws IOException {
		desktop.clickOnDeskTopTab();
		logger.info("Clicked on Tab");
		Utilities.takeScreenShot("DeskTopPageTabButton");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws IOException {
		desktop.clickOnshowAllDesktops();
		logger.info("Clicked on Show All Desktops");
		Utilities.takeScreenShot("DeskTopPage");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		desktop.SeeAllItemsArePresentInDeskTopPage();
		logger.info("Show on ");
		Utilities.takeScreenShot("All items on desktop page");
		
	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws IOException {
		desktop.clickonAddToCartButton();
		logger.info("HP LP3065");
		Utilities.takeScreenShot("Add to Cart Button");
	}
	
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws IOException {
		desktop.clickonAddToCartButton();
		logger.info("Added to Cart");
		Utilities.takeScreenShot("Click On Add to Cart Button");

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) throws IOException {
		desktop.showMessageSuccessfullyAddedToCart();
		logger.info("Success: you have added HP LP 3065 to your Shopping cart!");
		Utilities.highlightelementBackground("Success: you have added HP LP 3065 to your Shopping cart!");
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktop.clickOncanonSelectColor();
		logger.info("Show Color");

	}
	
	//==============review================================
		@When("User click on Canon EOS 5D item")
		public void user_click_on_canon_eos_5d_item() {
		    desktop.clickOnCanon();
		    logger.info("Clicked On Canon EOS 5D");
		    
		}

		@When("User click on write a review link")
		public void user_click_on_write_a_review_link() {
			desktop.clickONcanonreviewlink();
			
			
		}

		@When("user fill the review information with below information")
		public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
			List<Map<Object, Object>> info = dataTable.asMaps(String.class,String.class);
			desktop.enterYourName(info.get(0).get("name"));
			desktop.enterYourReview(info.get(0).get("Review"));
			logger.info("user entered personal Information" + info.toString());	
		}
        
		@When("User click on Continue Button")
		public void user_click_on_continue_button() {
		    
		}

		@Then("User should see a message with ‘Thank you for your review. It has been submitted to the  webmaster for approval.”")
		public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		    
		}
}
