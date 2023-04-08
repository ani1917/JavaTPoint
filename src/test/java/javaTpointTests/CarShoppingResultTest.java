package javaTpointTests;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.testng.annotations.Test;

import actionsInPages.CarShoppingPage;
import actionsInPages.LandingPagesActions;
import driverSelection.SelectBrowser;



public class CarShoppingResultTest extends SelectBrowser{
	
	@Test
	public void verifyCarResult() {
		
		String zipcode = "07054";
		// landpgact = new LandingPagesActions(driver);
		landpgact.clickIntiallink(zipcode);
		CarShoppingPage cshpg = new CarShoppingPage(driver);
		cshpg.carShoppingResultperformact();
		String valzip = cshpg.validatezipcode();
		assertEquals(valzip, zipcode);
		//assertEquals(, "07045");	
	}
	
@Test
	public void validateHeader() {
		String zipcode = "07054";
		//LandingPagesActions landpgact = new LandingPagesActions(driver);
		landpgact.clickIntiallink(zipcode);
		//new CarShoppingPage(driver);
		cshpg.carShoppingResultperformact();
		String validateHeaders = cshpg.validateheadercarshop();
		assertEquals(validateHeaders, "New and used vehicles for sale");
	}
@Test
public void dealerLoginClick() {
	String zipcode = "07054";
	//landpgact = new LandingPagesActions(driver);
	landpgact.clickIntiallink(zipcode);
	CarShoppingPage cshpg = new CarShoppingPage(driver);
	cshpg.carShoppingResultperformact();
	String valzip = cshpg.validatezipcode();
	String currentWindowHandle =    driver.getWindowHandle();
	cshpg.dealerLoginLink();
	Set<String> windowHandles  = driver.getWindowHandles();//set does not accept unique tab values.
	for(String handle:windowHandles)
	{
		driver.switchTo().window(handle);
		if(driver.getTitle().equals("Sign in to Dealer Dash")) {
			String valHeader = dealerHeader.verifyPageHeader();
			assertEquals(valHeader, "Welcome to Cars.com");
		}
	}
	driver.switchTo().window(currentWindowHandle);
	String validateHeaders = cshpg.validateheadercarshop();
	assertEquals(validateHeaders, "New and used vehicles for sale");
}



}
