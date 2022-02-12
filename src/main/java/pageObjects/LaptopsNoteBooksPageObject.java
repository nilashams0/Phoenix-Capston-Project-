package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.core.logging.Logger;
import junit.framework.Assert;
import utilities.Utilities;

public class LaptopsNoteBooksPageObject extends Base{

	public LaptopsNoteBooksPageObject() {
		

	PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = " //a[text()='Laptops & Notebooks']")
	 private WebElement laptopNoteBooksTab;
     @FindBy(xpath = "(//*[@class='dropdown'])[3]") 
     private WebElement laptopNoteBooksdropdown;
     @FindBy(xpath = "//*[text()='Show All Laptops & Notebooks']") 
     private WebElement laptopNoteBooksshowAll;
	@FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
	private WebElement laptopNoteBooksText;
	@FindBy(xpath = "//img[@title='Laptops & Notebooks']")
	private WebElement laptopNoteBooksImg;
	@FindBy(xpath = "//p[contains(text(),'Shop Laptop feature only the best laptop deals on ')]")
	private WebElement laptopNoteBooksCaption;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refneSearch;
	@FindBy(xpath = "(//*[text( )='Macs (0)'])[2]")
	private WebElement macLink;
	@FindBy(xpath = "(//*[text( )='Windows (0)'])[2]")
	private WebElement windowsLink;
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
	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement hP3065Img;
 	@FindBy(linkText = "HP LP3065" )
 	private WebElement hPLP3065;
 	@FindBy(xpath = "//p[contains(text(), 'Stop your co-worker ')]")
 	private WebElement hPLpCaption;
 	@FindBy(xpath = "(//*[@class= 'price'])[1]")
 	private WebElement hPLPPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $100.00']")
 	private WebElement hPlpPriceTax;
 	@FindBy(xpath = "(//*[@type='button'])[9]")
 	private WebElement hPAddTocartBtn;
 	@FindBy(xpath = " //div[@class='alert alert-success alert-dismissible']")
 	private WebElement SuccessmasgForAddToCartMacBook;
 	@FindBy(xpath = "(//*[@type='button'])[10] ")
 	private WebElement hPAddToWishListBtn;
 	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]")
 	private WebElement hPComparBtn;
 	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookitem;
 	@FindBy(linkText = "MacBook" )
 	private WebElement macBook;
 	@FindBy(xpath = "//p[contains(text(), 'Intel Core 2')]")
 	private WebElement macBookCaption;
 	@FindBy(xpath = "(//*[@class= 'price'])[2]")
 	private WebElement macBookPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $500.00']")
 	private WebElement macBookPriceTax;
 	@FindBy(xpath = "(//*[@type='button'])[12]")
 	private WebElement macBookaddTocartoption;
 	@FindBy(xpath = "(//*[@type='button'])[13]")
 	private WebElement macBookAddToWishListBtn;
 	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[position()=7]")
 	private WebElement macBookComparBtn;
 	@FindBy(xpath = "//button[@id='button-cart']")
 	private WebElement macBookCartBtn;
 	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImg;
 	@FindBy(linkText = "MacBook Air" )
 	private WebElement macBookAir;
 	@FindBy(xpath = "//p[contains(text(), 'MacBook Air')]")
 	private WebElement macBookAirCaption;
 	@FindBy(xpath = "(//*[@class= 'price'])[3]")
 	private WebElement macBookAirPrice;
 	@FindBy(xpath = "//div[3]//div[2]//div[2]//div[2]//button[1]")
 	private WebElement macBookAirPriceTax;
 	@FindBy(xpath = "(//*[@type='button'])[15]")
 	private WebElement macBookAiraddTocartBtn;
 	@FindBy(xpath = "(//*[@type='button'])[16]")
 	private WebElement macBookAirAddToWishListBtn;
 	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[position()=3]")
 	private WebElement macBookAirComparBtn;
 	@FindBy(xpath = "//a[text()='Product Comparison']")
 	private WebElement macbookAirProductComparisonList;
 	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
 	private WebElement macbookAirSuccessAddedinComparison;
 	@FindBy(xpath = "//img[@title='MacBook Pro']")
 	private WebElement macBookProImg;
 	@FindBy(xpath = "//a[text()='MacBook Pro']")
 	private WebElement macbookproitem;
 	@FindBy(xpath = "//p[contains(text(), 'Latest Intel mobile architecture')]")
 	private WebElement macBookProCaption;
 	@FindBy(xpath = "(//*[@class= 'price'])[4]")
 	private WebElement macBookProPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $2,000.00']")
 	private WebElement macBookProPriceTax;
 	@FindBy(xpath = "(//*[@type='button'])[18]")
 	private WebElement macBookProaddTocartBtn;
 	@FindBy(xpath = "(//*[@type='button'])[19]")
 	private WebElement macBookProAddToWishListBtn;
 	@FindBy(xpath = "(//*[@type='button'])[20]")
 	private WebElement macBookProComparBtn;
 	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVAIOImg;
 	@FindBy(linkText = "Sony VAIO" )
 	private WebElement sonyVAIO;
 	@FindBy(xpath = "//p[contains(text(),'Unprecedented power. The next generation of proces')]")
 	private WebElement sonyVAIOCaption;
 	@FindBy(xpath = "(//*[@class= 'price'])[5]")
 	private WebElement sonyVAIOPrice;
 	@FindBy(xpath = "(//*[@type='button'])[21]")
 	private WebElement sonyVAIOaddTocartBtn;
 	@FindBy(xpath = "(//*[@type='button'])[22]")
 	private WebElement sonyVAIOAddToWishListBtn;
 	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
 	private WebElement sonyVAIOLoginMsg;
 	@FindBy(xpath = "(//*[@type='button'])[23]")
 	private WebElement sonyVAIOComparBtn;	
    @FindBy(className = "col-sm-6 text-right")	
    private WebElement showPage1t05;
    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooksTab;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macBookItem;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
	@FindBy(xpath = "//table[@class='table table-striped']//tr//td//button")
	private WebElement removeButton; 
 
   
    
    public void clickOnLaptopsNoteBooks() {
    	laptopNoteBooksTab.click();
    }

	public void clickOnshowAllLaptops() {
		laptopNoteBooksshowAll.click();
		
	}

	public void clickonMacBookItem() {
		macBookItem.click();
		
	}
	public void clickonAddToCartButton() {
		macBookCartBtn.click();
		
	}

	public boolean clickOnSuccessmasgForAddToCartMacBook() {
		if(SuccessmasgForAddToCartMacBook.isDisplayed()) {
			return true;
		}else
			
		return false;
	}
	
	

	//==============Product Comparison=================
	

	public void clickonproductcomparisonicononMacBook() {
		macBookComparBtn.click();	
	}

	public void clickOnmacBookAirComparisonicon() {
		macBookAirComparBtn.click();
		
	}

	public boolean showMessageSuccessfullyAddedToproductComparison() {
		
		if(SuccessmasgForAddToCartMacBook.isDisplayed()) {
			return true;
	}else 
		
		   return false;
		
	}

	public void clickOnmacbookAirProductComparisonList() {
		macbookAirProductComparisonList.isSelected();
		
	}
     //=============WishList============

	public void clickOnsonyVAIOAddToWishListBtn() {
		sonyVAIOAddToWishListBtn.click();
	}

	public void showMessageYouMustLoginToSaveVAIOToWishList() {
		sonyVAIOLoginMsg.isDisplayed();
		
	}
	
	//=================================
	
	public void clickOnlaptopsAndNoteBooksTab() {
		Utilities.waitAndClickElement(laptopsAndNoteBooksTab);
	}
	public void clickOnlaptopsAndNoteBooksFromList() {
		Utilities.waitAndClickElement(showAllLaptopsAndNotebooks);
	}
	public void clickOnMacBookItem() {
		Utilities.waitAndClickElement(macBookItem);
	}
	public void clickOnAddToCartButton() {
		Utilities.waitAndClickElement(addToCartButton);
	}
	public void verifySuccessMessage(String strSuccessMessage) {
		String actualSuccessMssg = successMessage.getText();
		String strString = actualSuccessMssg.substring(0, 54);
		Assert.assertEquals(strSuccessMessage, strString);
	}
	public void verifyCartTotal(String strCartTotal) {
		String actualCartTotal = cartTotal.getText();
		Assert.assertEquals(strCartTotal, actualCartTotal);
	}
	public void clickOnCartOption() {
		Utilities.waitAndClickElement(cartTotal);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickOnRemoveItemButton() {
		Utilities.waitAndClickElement(removeButton);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void verifyCartTotalAfterRemovingItem(String strCartTotalAfterRemove) {
		String actualCartTotal = cartTotal.getText();
		System.out.println("actual cart total after removing: =======" + actualCartTotal);
		Assert.assertEquals(strCartTotalAfterRemove, actualCartTotal);
		System.out.println(actualCartTotal);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 


     
  
