package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages.GherkinDocument.Feature.Step.DataTable;
import pageObjects.retailPageObject;
import utilities.Utilities;

public class retailStepDef extends Base  {
     
	
	retailPageObject retail = new retailPageObject();
	
	

		@Given("User click  on MyAccount")
		public void user_click_on_my_account() {
			retail.clickOnMyAccountButton();
		}

		@When("User click on Login")
		public void user_click_on_login() {
			retail.clickOnLoginButton();
			logger.info("Login button was clicked successfully");
		}

		@When("User enter username ‘userName’ and password {string}")
		public void user_enter_username_user_name_and_password(String string) {
			retail.enterUserName();
			retail.enterPassword();
			logger.info("Username and Passwerd entered successfully");
		}
		@When("User click on Login button")
		public void user_click_on_login_button1() {
			retail.loginButton();
			logger.info("Clicked On Login Button");
		}

		
		//============Affiliate Account============
		
		@When("User click on 'Register for an Affiliate Account' link")
		public void user_click_on_register_for_an_affiliate_account_link() {
		    retail.clickOnregisterForAffiliateAccount();
		    logger.info("Register for an Affiliate Account link was clicked successfully");
			
		}
		
		@When("User fill affiliate form with below information")
		public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		    List<Map<String, String>>editAffiliate = dataTable(String.class, String.class);
		    editAffiliate.get(0).get("company");
		    editAffiliate.get(0).get("website");
		    editAffiliate.get(0).get("taxID");
		    editAffiliate.get(0).get("paymentMethod");
		}

		private List<Map<String, String>> dataTable(Class<String> class1, Class<String> class2) {
			return null;
		}

		@When("User check on About us check box")
		public void user_check_on_about_us_check_box() {
		    retail.clickOnagreeButton();
		    logger.info("User Clicked On Agree Radio Button");
		}

		@When("User click on Continue button")
		public void user_click_on_continue_button() {
		    retail.clickOncontinueButton();
		    logger.info("user Clicked On Continue Button");
		}

		@Then("User should see a success message")
		public void user_should_see_a_success_message() throws IOException {
		   retail.successMsgDisplayed();
		   logger.info(" Success: Your account has been successfully updated");
		   Utilities.takeScreenShot("Affiliate Account Successfully Created");
		}


}
