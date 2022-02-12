package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class LaptopStepDef extends Base {
	
	LaptopsNoteBooksPageObject laptop = new LaptopsNoteBooksPageObject();
	
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws Throwable {
		laptop.clickOnLaptopsNoteBooks();
	   logger.info("Clicked on Tab");
		Utilities.takeScreenShot("LaptopPageTabButton");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws Throwable {
		laptop.clickOnshowAllLaptops();
		logger.info("Clicked on Show All LapTops &Note Books");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	    laptop.clickonMacBookItem();
	    logger.info("Clicked on MacBook Item");
	
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
	    laptop.clickOnSuccessmasgForAddToCartMacBook();
	    logger.info("Success: You have added MacBook to your shopping cart!");
	    
	    
	}
	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	    
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    
	}
	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	//====================Product Comprison========================
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    laptop.clickonproductcomparisonicononMacBook();
	    logger.info("Clicked on MacBook Comparison icon");
	}
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    laptop.clickOnmacBookAirComparisonicon();
	    logger.info("Clicked on MacBookAir Comparison icon");
	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’ And User click on Product comparison link")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison_and_user_click_on_product_comparison_link() {
		laptop.showMessageSuccessfullyAddedToproductComparison();
		logger.info(" Success: You have added MacBook Air to your product comparison!");
		Utilities.highlightelementBackground(" Success: You have added MacBook Air to your product comparison!");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws Throwable {
	    laptop.clickOnmacbookAirProductComparisonList();
	    Utilities.takeScreenShot("Product ComParison Chart");
	}

	//=============WishList==============
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptop.clickOnsonyVAIOAddToWishListBtn();
	    logger.info("Sony VAIO Added To Wish List");
	}
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish  list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	    laptop.showMessageYouMustLoginToSaveVAIOToWishList();
	    logger.info(" You must login or create an account to save Sony VAIO to your wish list!");
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptop.clickonMacBookItem();
		logger.info("Clicked On MacBookPro");
		
	}
	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
	    
	}
    
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	    
	}
//===================================
	
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item1() {
		laptop.clickOnMacBookItem();
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		laptop.clickOnAddToCartButton();
	}

   @Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		System.out.println("string from stepDefinition method: " + string);
		laptop.verifySuccessMessage(string);
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(String string) {
		laptop.verifyCartTotal(string);
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option1() {
	laptop.clickOnCartOption();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart1() {
	laptop.clickOnRemoveItemButton();
	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
	laptop.verifyCartTotalAfterRemovingItem(string);
	}
	
}



	


