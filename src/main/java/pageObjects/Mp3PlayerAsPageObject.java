package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayerAsPageObject extends Base{
	
	
public Mp3PlayerAsPageObject() {
		
		PageFactory.initElements(driver, this);
			
}
		
         @FindBy(xpath = "(//*[@class='dropdown'])[6]") 
         private WebElement mp3playerdropdown;
         @FindBy(xpath = "(//*[text( ) = 'MP3 Players'])[2]")
         private WebElement mp3playertitle;
		 @FindBy(xpath = "//img[@title='MP3 Players']")
		 private WebElement mp3playersimg;
		 @FindBy(xpath = "//p[contains(text(),'Shop Laptop feature only the best laptop deals on ')]")
		 private WebElement mp3playersCaption;
		 @FindBy(xpath = "//h3[text()='Refine Search']")
		 private WebElement mp3PlayersRefineSearch;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 11 (0)')]")
		 private WebElement mp3PlayersTest11;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 12 (0)')]")
		 private WebElement mp3PlayersTest12;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 15 (0)')]")
		 private WebElement mp3PlayersTest15;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 16 (0)')]")
		 private WebElement mp3PlayersTest16;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 17 (0)')]")
		 private WebElement mp3PlayersTest17;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 18 (0)')]")
		 private WebElement mp3PlayersTest18;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 19 (0)')]")
		 private WebElement mp3PlayersTest19;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 20 (0)')]")
		 private WebElement mp3PlayersTest20;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 21 (0)')]")
		 private WebElement mp3PlayersTest21;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 22 (0)')]")
		 private WebElement mp3PlayersTest22;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 23 (0)')]")
		 private WebElement mp3PlayersTest23;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 24 (0)')]")
		 private WebElement mp3PlayersTest24;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 4 (0)')]")
		 private WebElement mp3PlayersTest4;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 5 (0)')]")
		 private WebElement mp3PlayersTest5;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 6 (0)')]")
		 private WebElement mp3PlayersTest6;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 7 (0)')]")
		 private WebElement mp3PlayersTest7;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 8 (0)')]")
		 private WebElement mp3PlayersTest8;
		 @FindBy(xpath = "//*[@class='col-sm-3']//a[contains(text(),'test 9 (0)')]")
		 private WebElement mp3PlayersTest9;
		 @FindBy(className = "fa fa-th-list")
		 private WebElement list;
		 @FindBy(className = "btn btn-default active")
		 private WebElement grid;
		 @FindBy(xpath = "//select[@id='input-sort']")
		 private WebElement sortBy;
		 @FindBy(xpath = "//select[@id='input-limit']")
		 private WebElement show;
		 @FindBy(xpath = "(//*[@class = 'img-responsive'])[2]")
		 private WebElement iPodClassicimg;
		 @FindBy(xpath = "//*[text( ) = 'iPod Classic']")
		 private WebElement iPodClassicTitle;
		 @FindBy(xpath = " //p[contains(text(),'More room to move.')]")
		 private WebElement iPodClassicCaption;
		 @FindBy(xpath = "(//*[@class= 'price'])[1]")
		 private WebElement iPodClassicPrice;
		 @FindBy(xpath = "(//*[@type= 'button'])[9]")
		 private WebElement iPodClassicAddtocartbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[10]")
		 private WebElement iPodClassicAddtowishlistbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[11]")
		 private WebElement iPodClassiccomparebtn;
		 @FindBy(xpath = "(//*[@class = 'img-responsive'])[3]")
		 private WebElement iPodNanoimg;
		 @FindBy(xpath = "//*[text( ) = 'iPodNano']")
		 private WebElement iPodNanoTitle;
		 @FindBy(xpath = " //p[contains(text(),'Video in your pocket.')]")
		 private WebElement iPodNanoCaption;
		 @FindBy(xpath = "(//*[@class= 'price'])[2]")
		 private WebElement iPodNanoPrice;
		 @FindBy(xpath = "(//*[@type= 'button'])[12]")
		 private WebElement iPodNanoAddtocartbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[13]")
		 private WebElement iPodNanoAddtowishlistbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[14]")
		 private WebElement iPodNanocomparebtn;
		 @FindBy(xpath = "(//*[@class = 'img-responsive'])[4]")
		 private WebElement iPodShuffleimg;
		 @FindBy(xpath = "//*[text( ) = 'iPodShuffle']")
		 private WebElement iPodShuffleTitle;
		 @FindBy(xpath = " //p[contains(text(),'Born to be worn')]")
		 private WebElement iPodShuffleCaption;
		 @FindBy(xpath = "(//*[@class= 'price'])[3]")
		 private WebElement iPodShufflePrice;
		 @FindBy(xpath = "(//*[@type= 'button'])[15]")
		 private WebElement iPodShuffleAddtocartbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[16]")
		 private WebElement iPodShuffleAddtowishlistbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[17]")
		 private WebElement iPodShufflecomparebtn;
		 @FindBy(xpath = "(//*[@class = 'img-responsive'])[5]")
		 private WebElement iPodTouchimg;
		 @FindBy(xpath = "//*[text( ) = 'iPodShuffle']")
		 private WebElement iPodTouchTitle;
		 @FindBy(xpath = " //p[contains(text(),'Revolutionary multi-touch interface')]")
		 private WebElement iPodTouchCaption;
		 @FindBy(xpath = "(//*[@class= 'price'])[4]")
		 private WebElement iPodTouchPrice;
		 @FindBy(xpath = "(//*[@type= 'button'])[18]")
		 private WebElement iPodTouchAddtocartbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[19]")
		 private WebElement iPodTouchAddtowishlistbtn;
		 @FindBy(xpath = "(//*[@type= 'button'])[20]")
		 private WebElement iPodTouchcomparebtn;
		@FindBy(xpath = "//*[@class= 'col-sm-6 text-right']")
		private WebElement show1to4;
		
		
		
		
		
		
		
		
		
}