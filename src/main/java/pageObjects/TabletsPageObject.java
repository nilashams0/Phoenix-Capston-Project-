package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base{
	
	public TabletsPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	
	@FindBy(xpath = "(//*[@class='dropdown'])[5]") 
    private WebElement tabletsdropdown;
	@FindBy(xpath = "//*[text( ) = 'Tablets']")
	private WebElement tablettitle;
	@FindBy(xpath = "//*[@class ='fa fa-th-list']")
	private WebElement list;
	@FindBy(xpath = "//*[@class ='fa fa-th']")
	private WebElement grids;
	@FindBy(id = "compare-total")
	private WebElement compareLink;
	@FindBy(xpath = "(//*[@class = 'form-control'])[1]")
	private WebElement sortbyBar;
	@FindBy(xpath = "(//*[@class = 'form-control'])[2]")
	private WebElement showBar;
	@FindBy(xpath = "(//*[@class = 'img-responsive'])[2]")
	private WebElement samsungGlagxyimg;
	@FindBy(xpath = "//*[text( ) = 'Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTitle;
	@FindBy(xpath = " //p[contains(text(),'Samsung Galaxy Tab 10.1, is the world’s thinnest t')]")
	private WebElement samsungCaption;
	@FindBy(xpath = "//*[@class= 'price']")
	private WebElement samsungPrice;
	@FindBy(xpath = "(//*[@type= 'button'])[9]")
	private WebElement samsungAddtocartbtn;
	@FindBy(xpath = "(//*[@type= 'button'])[10]")
	private WebElement samsungAddtowishlistbtn;
	@FindBy(xpath = "(//*[@type= 'button'])[11]")
	private WebElement samsungcomparebtn;
	@FindBy(xpath = "//*[@class= 'col-sm-6 text-right']")
	private WebElement show1of1;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
