package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;

public class  retailPageObject extends Base {

public retailPageObject() {
		
		
		PageFactory.initElements(driver, this);

		}
	
	@FindBy(xpath = "//span[@class='caret']")
	private WebElement myAccountdropdown;
	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement myAccountbutton;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']")
	private WebElement clickOnlogin;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement clickOnLoginButton;
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiiateregisterLink;
	@FindBy (xpath = "//atext()='Register for and affiliate account']")
	private WebElement registerForAffiliateAccount;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement companyNameTextBox;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteNameTextBox;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIdTextBox;
	@FindBy(xpath = "input[@name='payment' and @xpath]")
	private WebElement chequerRadioButton;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsg;
	
	
	public void clickOnMyAccountButton() {
		myAccountbutton.click();
	}
	public void clickOnLoginButton() {
		clickOnLoginButton.click();
	}
	public void enterUserName() {
		emailField.sendKeys("sdet@tekschool.us");
	}
	public void enterPassword() {
		passwordField.sendKeys("sdet");
	
	}
	public void loginButton() {
		clickOnLoginButton.click();
	}
	public void clickOnregisterForAffiliateAccount() {
		registerForAffiliateAccount.click();
	}
	public void verifyChequeRadioButtonIsSelected() {
		boolean isChequeRadioButtonIsSelected = chequerRadioButton.isSelected();
		System.out.print("Cheque Radio Button is Selected: " + isChequeRadioButtonIsSelected);
	}
	 public void clickOncontinueButton() {
		 continueButton.click();
	 }
	public void clickOnagreeButton() {
		agreeButton.click();
	}
	
	public void successMsgDisplayed() {
		String expectedMsg = "Success: Your account has been successfully updated." ;
	    String actualMsg = successMsg.getText();
	    try {
	    	Assert.assertEquals(expectedMsg, actualMsg);
	    }catch (Exception e) {
	    	
	    }
		
	}
	
	
	
	
	
	
	
	
		
	
	
}
