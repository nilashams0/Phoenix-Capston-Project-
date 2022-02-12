package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{
	
	
public SoftwarePageObject() {
		
		PageFactory.initElements(driver, this);
			
	}

    @FindBy(xpath = "(//*[text( ) = 'Software'])[2]")
    private WebElement toftwaretitle;
    @FindBy(xpath = "(//*[text( ) = 'Software'])[3]")
    private WebElement softwareLinkicon;
    @FindBy(xpath = "(//*[text( ) = 'Software'])[4]")
    private WebElement softwareText;
    @FindBy(xpath = "//*[@id= 'content']")
    private WebElement softwareCaption;
    @FindBy(xpath = "//*[@class = 'btn btn-primary']")
    private WebElement softwareContinueBtn;
    
    


















}
