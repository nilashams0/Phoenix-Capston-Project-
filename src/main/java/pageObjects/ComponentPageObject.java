package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentPageObject extends Base {
	
	public ComponentPageObject() {
	
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "(//*[@class='dropdown'])[4]") 
    private WebElement componentsdropdown;
	@FindBy(xpath = "//h2[text()='Components']")
	private WebElement componentsText;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;
	@FindBy(xpath = "(//*[text( )= 'Mice and Trackballs (0)'])[2]")
	private WebElement miceandTrackballs;
	@FindBy(xpath = "(//*[text( )= 'Monitors (2)'])[2]")
	private WebElement monitors;
	@FindBy(xpath = "(//*[text( )= 'Printers (0)'])[2]")
	private WebElement printers;
	@FindBy(xpath = "(//*[text() ='Scanners (0)'])[2]")
	private WebElement scanners;
	@FindBy(xpath = "(//*[text() ='Web Cameras (0)'])[2]")
	private WebElement webcameras;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
