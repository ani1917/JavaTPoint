package actionsInPages;

import org.openqa.selenium.WebDriver;

import javatpointWebElements.DealerLoginPage;

public class DealerPageHeader {
	WebDriver driver;
	public DealerPageHeader(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyPageHeader() {
		 return driver.findElement(DealerLoginPage.dPageHeader).getText();
		
	}
}
