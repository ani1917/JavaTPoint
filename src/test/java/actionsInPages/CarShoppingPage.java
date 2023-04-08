package actionsInPages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import javatpointWebElements.CarShoppingResult;
import javatpointWebElements.LandingPages;

public class CarShoppingPage {
	
	public WebDriver driver;
	public  CarShoppingPage(WebDriver driver) {
		this.driver = driver;
	}
public LandingPagesActions carShoppingResultperformact() {
	driver.findElement(CarShoppingResult.carshopzip).click();
		return new LandingPagesActions(driver);
	}

public String validatezipcode() {
	
	return driver.findElement(CarShoppingResult.carshopzip).getAttribute("value");
		
	}

public String validateheadercarshop() {
	
	return driver.findElement(CarShoppingResult.carshopheaderval).getText();
		
	}

public void dealerLoginLink() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scroll(0,document.body.scrollHeight)");
	driver.findElement(CarShoppingResult.dealerLoginLinkTxt).click();
	
	
}
}
