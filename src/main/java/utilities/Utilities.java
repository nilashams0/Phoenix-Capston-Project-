package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import junit.framework.Assert;

public class Utilities extends Base{
	
	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}

	
	public static void takeScreenShot(String fileName) throws IOException {
		
		String path = ".\\output\\screenShots\\";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}

	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}

	public static void highlightelementBackground(String string) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", string);
	}

	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}


	public static void highlightedelementRedborder() {
		// TODO Auto-generated method stub
		
	}


	@SuppressWarnings("deprecation")
	 public static void waitAndClickElement(WebElement element) {
	  boolean clicked = false;
	  int attempts = 0;
	  while(!clicked && attempts < 10) {
	   try {
	   Object object = new Object();
	((WebElement) object).click();
	   System.out.println("Successfully clicked on the WebElement: " + "=" + element.toString());
	   clicked = true;
	   } catch (Exception e) {
	    try {
	    //logger.info("Failed to click the element");
	    } catch (Exception e2) {
	    }
	    Assert.fail("Unable to click the element: " + "=" +  element.toString());
	   } 
	  attempts++;
	  } 
	 }

	// How we can give border to an element on webpage and take screenshot
	 public static void highlightelementRedBorderAndTakeScreenshot(WebElement element, String fileName) throws IOException {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].style.border='2px solid red'", element);
	  try {
	   Thread.sleep(3000);
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	  Utilities.takeScreenShot(fileName);

	 }

}
