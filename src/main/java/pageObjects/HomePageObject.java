package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject() {
		
		
		PageFactory.initElements(driver, this);

		}
    @FindBy(xpath= "//span[contains(text(),'Currency')]")
    private WebElement currency;
    @FindBy(xpath = "//button[@name='EUR']")
    private WebElement currencyEUR;
    @FindBy(xpath = "//strong[contains(text(),'€')]")
    private WebElement CurrencyChangedtoEUR;
    @FindBy(xpath = "//i[@class='fa fa phone']")
    private WebElement phoneButton;
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    private WebElement myaccountfield;
    @FindBy(className = "dropdown open")
    private WebElement MyAccDropdownOpen;
    @FindBy(xpath = "//a[text()='register']")
 	private WebElement registerbuttonfield;
    @FindBy(xpath = "//a[text()='Login']")
 	private WebElement heartbuttun;
 	@FindBy(id = "wishlist-total")
 	private WebElement washlistbutton;
 	@FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
 	private WebElement shoppingcartbutton;
 	@FindBy(xpath = "//a[@class='Shopping Cart']")
 	private WebElement topshoppingCartButton;
 	@FindBy(xpath = "//'span[text()='checkout']")
 	private WebElement CheckoutButton;
 	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
 	private WebElement shoppingCartButton;
 	@FindBy(xpath = "//p[@class='text-center']")
 	private WebElement dropdownText;
 	@FindBy(className = "form-control input-lg")
 	private WebElement searchbar;
 	@FindBy(className = "btn btn-default btn-lg")
 	private WebElement SearchButton;
 	@FindBy(className = "btn btn-inverse btn-block btn-lg dropdown-toggle")
 	private WebElement shoppingcart;
 	@FindBy(xpath = "//div[@id='slideshow']")
 	private WebElement slidshow;
 	@FindBy(xpath = "//a[@class= 'img-responsive']")
 	private WebElement macimgresponsive;
 	@FindBy(xpath = "//a[@title='MacBook']")
 	private WebElement macBook;
 	@FindBy(xpath = "//p[contains(text(), 'Intel Core')]")
 	private WebElement macBookCaption;
 	@FindBy(xpath = "//div[7]//div[1]//div[2]//div[1]//p[2]")
 	private WebElement macBookPrice;
 	@FindBy(xpath = "//span[text()='Ex Tax: $500.00']")
 	private WebElement macBookPriceTax;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]/div/div[3]/button[1]")
 	private WebElement macAddtoCartButton;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]/div/div[3]/button[2]")
 	private WebElement macAddToWashlist;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]/div/div[3]/button[3]")
 	private WebElement macCamparebtn;
 	@FindBy(className = "img-responsive")
 	private WebElement phoneImage;
 	@FindBy(xpath = "//a[@title='Iphone']")
 	private WebElement iphone;
 	@FindBy(xpath = "//p[contains(text(), 'iPhone is a revolutionary ')]")
 	private WebElement iphoneCaption;
 	@FindBy(className ="price")
 	private WebElement iphonePrice;
 	@FindBy(className = "price-tax")
 	private WebElement iphoneTax;
 	@FindBy(className ="fa fa-shopping-cart")
 	private WebElement iphoneAddtoCartIcon;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][2][1]/div/div[3]/button[1]")
 	private WebElement iphoneAddtocartbtn;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]/div/div[3]/button[2]")
 	private WebElement iphoneAddToWashlist;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div/div[3]/button[3] ")
 	private WebElement iphoneCamparebtn;
 	@FindBy (className ="img-responsive")
 	private WebElement appleCinema30Img;
 	@FindBy(linkText = "Apple Cinema 30")
 	private WebElement appleCinema30;
 	@FindBy(xpath = "//p[contains(text(), 'The 30-inch Apple Cinema ')]")
 	private WebElement appleCinemaCaption;
 	@FindBy(css ="#content > div.row > div:nth-child(3) > div > div p.price > span.price-new")
 	private WebElement appleCinemaNewPrice;
 	@FindBy(css = "#content > div.row > div:nth-child(3) > div > div p.price > span.price-old")
 	private WebElement appleCinemaOldPrice;
 	@FindBy(css = "#content > div.row > div:nth-child(1) > div > div.caption > p.price > span")
 	private WebElement appleCinemaPriceTax;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[1]") 	
    private WebElement appleCinemaAddToCartBtn;
    @FindBy(xpath = "//div[contains(@class,'product-layout')][3]/div/div[3]/button[2]")
    private WebElement appleCinemaAddToWishList;
    @FindBy(xpath = "//div[contains(@class,'product-layout')][3]/div/div[3]/button[3]")
 	private WebElement AppleCinemaCamparebtn;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[1]/a/img")
 	private WebElement canonImg;
 	@FindBy(linkText = "Canon EOS 5D")
    private WebElement canonEOS5DName;
 	@FindBy(xpath = "//p[contains(text(), 'Canon')]")
 	private WebElement canonEOS5DCaption;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[2]/p[2]/span[1]" )
 	private WebElement canonNewPrice;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[2]/p[2]/span[2]" )
 	private WebElement canonOldPrice;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[2]/p[2]/span[3]")
 	private WebElement canonPriceTax;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[3]/button[1]")
 	private WebElement canonAddTocartBtn;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[3]/button[2]")
 	private WebElement canonAddToWishListBtn;
 	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]/div/div[3]/button[3]")
 	private WebElement canonComparBtn;
 	@FindBy(xpath = "//html/body/footer/div/div/div[1]/h5")
 	private WebElement infoFooter;
 	@FindBy(xpath = "//a[text()='About Us']")
 	private WebElement aboutUsFooter;
 	@FindBy(linkText = "delivery Information")
 	private WebElement deliveryInfoFooter;
 	@FindBy(linkText = "privacy Policy")
 	private WebElement privacyPloicyFooter;
 	@FindBy(linkText = "terms & Conditions")
 	private WebElement termsCondiFooter;
 	@FindBy(xpath = "//html/body/footer/div/div/div[2]/h5")
 	private WebElement customerServiceFooter;
 	@FindBy(linkText = "Contact Us")
 	private WebElement contactUsFooter;
 	@FindBy(linkText = "Returns")
 	private WebElement ceturnsFooter;
 	@FindBy(linkText = "Site Map")
 	private WebElement siteMapFooter;
 	@FindBy(linkText = "//h5[text()='Extras']")
 	private WebElement extrrasFooter ;
 	@FindBy(linkText = "Brands")
 	private WebElement brandsFooter;
 	@FindBy(linkText = "Gift Certificates")
 	private WebElement giftCertificatesFooter;
 	@FindBy(linkText = "Affiliate")
 	private WebElement affiliateFooter;
 	@FindBy(linkText = "Specials")
 	private WebElement specialsFooter;
 	@FindBy(xpath = "//h5[text()='My Account']")
 	private WebElement myAccountFooter;
 	@FindBy(xpath = "//html/body/footer/div/div/div[4]/ul/li[1]/a")
 	private WebElement myaccountdropdownFooter;
 	@FindBy(linkText = "Order History")
 	private WebElement orderHistoryFooter;
 	@FindBy(xpath = "//html/body/footer/div/div/div[4]/ul/li[3]/a")
 	private WebElement wishlistFooter;
 	@FindBy(xpath = "//html/body/footer/div/div/div[4]/ul/li[4]/a")
 	private WebElement newsletterFooter;
 	@FindBy(xpath = "//html/body/footer/div/hr")
 	private WebElement lineFooter;
 	@FindBy(xpath = "//html/body/footer/div/p")
 	private WebElement poweredFooter;
	
 	
 	
 	
 	
 	public void clickOncurrency() {
 		currency.click();

		
	}

	public void clickOnCurrenctEUR() {
		currencyEUR.click();
		
	}
 	
 	public void showOnCurrencyChangedtoEUR() {
 		CurrencyChangedtoEUR.isDisplayed();
 	
 	}
 	public void clickOnshoppingCartButton() {
 		shoppingCartButton.click();
 	}

	public void dropDowntextOpened() {
		dropdownText.isDisplayed();
		
	}
}
