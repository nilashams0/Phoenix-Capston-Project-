package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base{

	public DesktopPageObject() {
		
		
		PageFactory.initElements(driver, this);

		}
	
	@FindBy(xpath = "//*[text( )= 'TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	@FindBy(xpath = "(//*[@class= 'dropdown-toggle'])[1]")
	private WebElement desktoptab;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	@FindBy(xpath = "//a[@class='list-group-item active'] ")
	private WebElement desktops13;
	@FindBy(xpath = "//a[2]")
	private WebElement PC0;
	@FindBy(xpath = "//a[3]")
	private WebElement mac1;
	@FindBy(xpath = "//a[4]")
	private WebElement labtopandNoteBooks;
	@FindBy(xpath = "//a[5]")
	private WebElement components2;
	@FindBy(xpath = "//a[6]")
	private WebElement Tablets1;
	@FindBy(xpath = "//a[7]")
	private WebElement softwares0;
	@FindBy(xpath = "//a[8]")
	private WebElement phonesandPADs3;
	@FindBy(xpath = "//a[9]")
	private WebElement cameras2;
	@FindBy(xpath = "//a[10]")
	private WebElement mP3Player4;
	@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
 	private WebElement showing1to12;
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement desktopTitle;
	@FindBy(className = "img-thumbnail")
	private WebElement desktopImg;
	@FindBy(xpath = "//p[contains(text(), 'Example of category description text')]")
	private WebElement exampleDesc;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;
	@FindBy(xpath = "//div[@class='col-sm-3']//a[contains(text(),'PC (0)')]")
	private WebElement pcLink;
	@FindBy(xpath = "//div[@class='col-sm-3']//a[contains(text(),'Mac (1)')]")
	private WebElement macLink;
	@FindBy(className = "fa fa-th-list")
	private WebElement list;
	@FindBy(className = "btn btn-default active")
	private WebElement grid;
	@FindBy(id = "compare-total")
	private WebElement compareList;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortBy;
	@FindBy(xpath = "//select[@id='input-limit")
	private WebElement sizeBy;
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinema30Img;
 	@FindBy(linkText = "Apple Cinema 30")
 	private WebElement appleCinema30;
 	@FindBy(xpath = "//p[contains(text(), 'The 30-inch Apple Cinema ')]")
 	private WebElement appleCinemaCaption;
 	@FindBy(xpath ="//span[text()='$110.00']")
 	private WebElement appleCinemaNewPrice;
 	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[1]//p[2]//span[2]")
 	private WebElement appleCinemaOldPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $90.00']")
 	private WebElement appleCinemaPriceTax;
    @FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]") 	
    private WebElement appleCinemaAddToCartBtn;
    @FindBy(xpath = "//div[contains(@class,'product-layout')][3]/div/div[3]/button[2]")
    private WebElement appleCinemaAddToWishList;
    @FindBy(xpath = "//div[contains(@class,'product-layout')][3]/div/div[3]/button[3]")
 	private WebElement appleCinemaCamparebtn;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[1]/a/img")
 	private WebElement canonImg;
 	@FindBy(linkText = "Canon EOS 5D")
    private WebElement canonEOS5DName;
 	@FindBy(xpath = "//p[contains(text(), 'Canon')]")
 	private WebElement canonEOS5DCaption;
 	@FindBy(xpath = "//span[text()='$98.00']" )
 	private WebElement canonNewPrice;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[2]/p[2]/span[2]" )
 	private WebElement canonOldPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $80.00']")
 	private WebElement canonPriceTax;
 	@FindBy(xpath = "(//*[@type= 'button'])[12]")
 	private WebElement canonAddTocartBtn;
 	@FindBy(xpath = "//select[@id='input-option226']")
 	private WebElement canonSelectColor;
 	@FindBy(xpath = "//select[@id=\"input-option226\"]/option[2]")
 	private WebElement canonSelectRedColor;
 	@FindBy(xpath = "//*[@id= 'input-quantity']")
 	private WebElement canonEnterQuantiry;
 	@FindBy(xpath = "//*[@id= 'button-cart']")
 	private WebElement canon5DAddToCartBtn;
 	@FindBy(xpath = "//*[@class= 'alert alert-success alert-dismissible']")
 	private WebElement canonAddedToCartAlertMsg;
 	@FindBy(xpath = "(//*[@type= 'button'])[13]")
 	private WebElement canonAddToWishListBtn;
 	@FindBy(xpath = "(//*[@type= 'button'])[14]")
 	private WebElement canonComparBtn;
 	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement hP3065Img;
 	@FindBy(linkText = "HP LP3065" )
 	private WebElement hPLP3065;
 	@FindBy(xpath = "//p[contains(text(), 'Stop your co-worker ')]")
 	private WebElement hPLpCaption;
 	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/p[2]")
 	private WebElement hPLPPrice;
 	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]//span[1]")
 	private WebElement hPlpPriceTax;
 	@FindBy(xpath = "(//*[@type= 'button'])[15]")
 	private WebElement desktophPAddTocartBtn;
 	@FindBy(xpath = "//*[@id= 'input-quantity']")
 	private WebElement enterQuantity;
 	@FindBy(xpath = "//button[contains(@onclick,'47')][3]")
 	private WebElement hPAddToCartBtn;
 	@FindBy(xpath = "(//*[@type= 'button'])[16]")
 	private WebElement hPAddToWishListBtn;
 	@FindBy(xpath = "//*[@class= 'alert alert-success alert-dismissible']")
 	private WebElement hPAddToCartAlertMessage;
 	@FindBy(xpath = "(//*[@type= 'button'])[17]")
 	private WebElement hPComparBtn;
 	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement HTCTouchHDImg;
 	@FindBy(linkText = "HTC Touch HD" )
 	private WebElement HTCTouchHD;
 	@FindBy(xpath = "//p[contains(text(), 'HTC Touch ')]")
 	private WebElement HTCTouchHDCaption;
 	@FindBy(xpath = "//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement HTCTouchHDPrice;
 	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[1]/p[2]/span[1]")
 	private WebElement HTCTouchHDPriceTax;
 	@FindBy(xpath = "//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement HTCTouchHDTocartBtn;
 	@FindBy(xpath = "//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement HTCTouchHDAddToWishListBtn;
 	@FindBy(xpath = "//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement HTCTouchHDComparBtn;
 	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImg;
 	@FindBy(linkText = "iPhone" )
 	private WebElement iPhone;
 	@FindBy(xpath = "//p[contains(text(), 'iPhone ')]")
 	private WebElement iPhoneCaption;
 	@FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement iPhonePrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $101.00']")
 	private WebElement iPhonePriceTax;
 	@FindBy(xpath = "//div[5]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement iPhoneaddTocartBtn;
 	@FindBy(xpath = "//div[5]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement iPhoneAddToWishListBtn;
 	@FindBy(xpath = "//div[5]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement iPhoneComparBtn;
 	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImg;
 	@FindBy(linkText = "iPod Classic" )
 	private WebElement iPodClassic;
 	@FindBy(xpath = "//p[contains(text(), 'More room to move')]")
 	private WebElement iPodClassicCaption;
 	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[6]/div[1]/div[2]/div[1]/p[2]")
 	private WebElement iPodClassicPrice;
 	@FindBy(xpath = "//div[6]//div[1]//div[2]//div[1]//p[2]//span[1]")
 	private WebElement iPodClassicPriceTax;
 	@FindBy(xpath = "//div[6]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement iPodClassicaddTocartBtn;
 	@FindBy(xpath = "//div[6]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement iPodClassicAddToWishListBtn;
 	@FindBy(xpath = "//div[6]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement iPodClassicComparBtn;
 	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImg;
 	@FindBy(linkText = "MacBook" )
 	private WebElement macBook;
 	@FindBy(xpath = "//p[contains(text(), 'Intel Core 2')]")
 	private WebElement macBookCaption;
 	@FindBy(xpath = "//div[7]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement macBookPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $500.00']")
 	private WebElement macBookPriceTax;
 	@FindBy(xpath = "//div[7]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement macBookaddTocartBtn;
 	@FindBy(xpath = "//div[7]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement macBookAddToWishListBtn;
 	@FindBy(xpath = "//div[7]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement macBookComparBtn;
 	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImg;
 	@FindBy(linkText = "MacBook Air" )
 	private WebElement macBookAir;
 	@FindBy(xpath = "//p[contains(text(), 'MacBook Air')]")
 	private WebElement macBookAirCaption;
 	@FindBy(xpath = "//div[8]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement macBookAirPrice;
 	@FindBy(xpath = "//div[8]//div[1]//div[2]//div[1]//p[2]//span[1]")
 	private WebElement macBookAirPriceTax;
 	@FindBy(xpath = "//div[8]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement macBookAiraddTocartBtn;
 	@FindBy(xpath = "//div[8]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement macBookAirAddToWishListBtn;
 	@FindBy(xpath = "//div[8]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement macBookAirComparBtn;
 	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImg;
 	@FindBy(linkText = "Palm Treo Pro" )
 	private WebElement palmTreoPro;
 	@FindBy(xpath = "//p[contains(text(), 'Palm Treo Pro')]")
 	private WebElement palmTreoProCaption;
 	@FindBy(xpath = "//div[9]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement palmTreoProPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $279.99']")
 	private WebElement palmTreoProPriceTax;
 	@FindBy(xpath = "//div[9]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement palmTreoProaddTocartBtn;
 	@FindBy(xpath = "//div[9]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement palmTreoProAddToWishListBtn;
 	@FindBy(xpath = "//div[9]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement palmTreoProComparBtn;
 	@FindBy(xpath = "//img[@title='Product 8']")
	private WebElement product8Img;
 	@FindBy(linkText = "Product 8" )
 	private WebElement product8;
 	@FindBy(xpath = "//p[text()='Product 8..']")
 	private WebElement product8Caption;
 	@FindBy(xpath = "//div[10]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement product8Price;
 	@FindBy(xpath = "//div[10]//div[1]//div[2]//div[1]//p[2]//span[1]")
 	private WebElement product8PriceTax;
 	@FindBy(xpath = "//div[10]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement product8addTocartBtn;
 	@FindBy(xpath = "//div[10]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement product8AddToWishListBtn;
 	@FindBy(xpath = "//div[10]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement product8ComparBtn;
 	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterImg;
 	@FindBy(linkText = "Samsung SyncMaster 941BW" )
 	private WebElement samsungSyncMaster;
 	@FindBy(xpath = "//p[contains(text(),'Imagine the advantages of going big without slowin')]")
 	private WebElement samsungSyncMasterCaption;
 	@FindBy(xpath = "//div[11]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement samsungSyncMasterPrice;
 	@FindBy(xpath = "//div[11]//div[1]//div[2]//div[1]//p[2]//span[1]")
 	private WebElement samsungSyncMasterPriceTax;
 	@FindBy(xpath = "//div[11]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement samsungSyncMasteraddTocartBtn;
 	@FindBy(xpath = "//div[11]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement samsungSyncMasterAddToWishListBtn;
 	@FindBy(xpath = "//div[11]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement samsungSyncMasterComparBtn;
 	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVAIOImg;
 	@FindBy(linkText = "Sony VAIO" )
 	private WebElement sonyVAIO;
 	@FindBy(xpath = "//p[contains(text(),'Unprecedented power. The next generation of proces')]")
 	private WebElement sonyVAIOCaption;
 	@FindBy(xpath = "//div[12]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement sonyVAIOPrice;
 	@FindBy(xpath = "//div[12]//div[1]//div[2]//div[1]//p[2]//span[1]")
 	private WebElement sonyVAIOPriceTax;
 	@FindBy(xpath = "//div[12]//div[1]//div[2]//div[2]//button[1]")
 	private WebElement sonyVAIOaddTocartBtn;
 	@FindBy(xpath = "//div[12]//div[1]//div[2]//div[2]//button[2]")
 	private WebElement sonyVAIOAddToWishListBtn;
 	@FindBy(xpath = "//div[12]//div[1]//div[2]//div[2]//button[3]")
 	private WebElement sonyVAIOComparBtn;
 	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
    private WebElement clickOnCanon;
    @FindBy(xpath = "//a[text()='Write a review']")
    private WebElement canonreviewlink;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement name;
    @FindBy(xpath = "//textarea[@id='input-review']")
    private WebElement reviewMessage;
    @FindBy(xpath = "//input[@name='rating'and@value='5']")
    private WebElement goodrating;
    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement continuebutton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement succestext;
    
    
    
    
    
    
 	
	public void validateRetailWebSite(WebElement textRetailWebSite) {
		String text = textRetailWebSite.getText();
		if(text.equalsIgnoreCase("Test Environment")) {
			logger.info("Text Verified");
		}else { 
			logger.info("Text doesn't Match");
				
		}
	}
	public boolean clickOnDeskTopTab() {
		if(desktoptab.isSelected())
			return true;
		else
			return false;	
	}
	public void clickOnshowAllDesktops() {
		showAllDesktops.click();
		
	}
     public void SeeAllItemsArePresentInDeskTopPage() {	
	}
	
	public void clickondesktopHpAddToCartButton() {
		desktophPAddTocartBtn.click();	
	}
	public void enterQuantity() {
         enterQuantity.clear();
         enterQuantity.sendKeys("1");
    	
	}
	public void clickonAddToCartButton() {
		hPAddToCartBtn.click();	
	}
	
    public void showMessageSuccessfullyAddedToCart() {
		hPAddToCartAlertMessage.getText();
		
	}
	
	public void clickOnCanonAddTocartBtn() {
			canonAddTocartBtn.click();
		}
		
	public void clickOncanonSelectColor() {
			canonSelectColor.clear();
			canonSelectColor.sendKeys("Red");
		}
	
	
	
	public void clickOnCanon5DAddToCartBtn() {
		canon5DAddToCartBtn.click();
	}
	 public void showCanonAddedToCartAlertMsg() {
		 canonAddedToCartAlertMsg.getText();
		 
	 }
	
	 public void clickOnCanon() {
			clickOnCanon.click();	
		}
		public void clickONcanonreviewlink() {
			canonreviewlink.click();
			
		}
		public void enterYourName(Object object) {
			name.sendKeys("sdet");
			
			
		}
		public void enterYourReview(Object object) {
			reviewMessage.sendKeys("I like it but sometimes its setting becomes dumb");
			
		}
		
			
		
		
}
