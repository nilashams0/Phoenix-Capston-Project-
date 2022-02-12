package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonePDAsPageObject extends Base {
	
	
public PhonePDAsPageObject() {
		
	PageFactory.initElements(driver, this);
	
}
	
	
       @FindBy(xpath = "(//*[text( ) = 'Phones & PDAs'])[2]")
       private WebElement phonesandPDAstitle;
       @FindBy(xpath = "(//*[text( ) = 'Phones & PDAs'])[3]")
       private WebElement phonesandPDAsLinkicon;
       @FindBy(xpath = "(//*[text( ) = 'Phones & PDAs'])[4]")
       private WebElement phonesandPDAsText;
       @FindBy(xpath = "//*[@class ='fa fa-th-list']")
   	   private WebElement list;
       @FindBy(xpath = "//*[@class ='fa fa-th']")
   	   private WebElement grids;
       @FindBy(xpath = "//*[@class ='btn btn-link']")
       private WebElement phonesandPDAsCampareLink;
       @FindBy(xpath = "(//*[@class = 'form-control'])[1]")
   	   private WebElement sortbyBar;
   	   @FindBy(xpath = "(//*[@class = 'form-control'])[2]")
   	   private WebElement showBar;
   	   @FindBy(xpath = "(//*[@class = 'img-responsive'])[2]")
   	   private WebElement phonesandPDAsImg;
   	   @FindBy(xpath = "//*[text( ) = 'HTC Touch HD']")
	   private WebElement phonesandPDAsTitle;
   	   @FindBy(xpath = "//p[contains(text(),'HTC Touch - in High Definition. Watch music videos')]")
   	   private WebElement phonesandPDAsCaption;
   	   @FindBy(xpath = "(//*[@class  = 'price' ])[1]")
   	   private WebElement phonesandPDAsprice;
   	   @FindBy(xpath = "(//*[@type  = 'button' ])[9]")
	   private WebElement phonesandPDdAddToCartBtn;
       @FindBy(xpath = "(//*[@type  = 'button' ])[10]")
	   private WebElement phonesandPDdAddTowishlistBtn;
       @FindBy(xpath = "(//*[@type  = 'button' ])[11]")
	   private WebElement phonesandPDsCampareBtn;
	   @FindBy(xpath = "(//*[@class = 'img-responsive'])[2]")
   	   private WebElement iphoneImg;
   	   @FindBy(xpath = "//*[text( ) = 'Iphone']")
	   private WebElement iphoneTitle;
   	   @FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary ')]")
   	   private WebElement piphoneCaption;
   	   @FindBy(xpath = "(//*[@class  = 'price' ])[2]")
   	   private WebElement iphoneprice;
   	   @FindBy(xpath = "(//*[@type  = 'button' ])[12]")
	   private WebElement iphoneAddToCartBtn;
       @FindBy(xpath = "(//*[@type  = 'button' ])[13]")
	   private WebElement iphoneAddTowishlistBtn;
       @FindBy(xpath = "(//*[@type  = 'button' ])[14]")
	   private WebElement iphoneCampareBtn;
       @FindBy(xpath = "(//*[@class = 'img-responsive'])[3]")
   	   private WebElement palmTreoProImg;
   	   @FindBy(xpath = "//*[text( ) = 'Ipalm Treo Pro']")
	   private WebElement palmTreoProTitle;
   	   @FindBy(xpath = "///p[contains(text(),'Redefine your workday with the Palm Treo Pro smart')]")
   	   private WebElement palmTreoProCaption;
   	   @FindBy(xpath = "(//*[@class  = 'price' ])[3]")
   	   private WebElement palmTreoProprice;
   	   @FindBy(xpath = "(//*[@type  = 'button' ])[15]")
	   private WebElement palmTreoProAddToCartBtn;
       @FindBy(xpath = "(//*[@type  = 'button' ])[16]")
	   private WebElement ipalmTreoProAddTowishlistBtn;
       @FindBy(xpath = "(//*[@type  = 'button' ])[17]")
	   private WebElement palmTreoProCampareBtn;
       @FindBy(xpath = "//*[@class= 'col-sm-6 text-right']")
       private WebElement show1of3;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}