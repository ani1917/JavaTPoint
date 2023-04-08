package actionsInPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javatpointWebElements.LandingPages;

public class LandingPagesActions{
	public WebDriver driver;
	public LandingPagesActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickIntiallink(String zipcode) {
		driver.findElement(LandingPages.makeusedornew).click();
		driver.findElement(LandingPages.makezip).clear();
		driver.findElement(LandingPages.makezip).sendKeys(zipcode);
		driver.findElement(LandingPages.makesearchbtn).click();
		
	}
	public Boolean scrollFindText() {
		 WebElement webelemt =   driver.findElement(LandingPages.searchScrollText);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webelemt);
		return webelemt.isDisplayed(); 
	}
	public Boolean scrollFindADealer() {
		WebElement webelemt1 =   driver.findElement(LandingPages.findDealer);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webelemt1);
		return webelemt1.isDisplayed();
		
	}
	public void findADealer() {
		driver.findElement(LandingPages.findDealer).click();		
	}
	
}