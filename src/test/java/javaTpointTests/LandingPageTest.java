package javaTpointTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import actionsInPages.LandingPagesActions;
import driverSelection.SelectBrowser;

public class LandingPageTest extends SelectBrowser{
	

	@Test
	public void LandingPagesActionstest () {
		
		landpgact.clickIntiallink("07054");
	}

	@Test
	public void scrollTestValidation () {
		Boolean statusValue =  landpgact.scrollFindText();
		assertTrue(statusValue);
	}
	@Test
	public void scrollFindADealer() {
	Boolean statusFindADealer = landpgact.scrollFindADealer();
	assertTrue(statusFindADealer);
	landpgact.findADealer();
	
	}
	
	
	
	
	@Test
	public void jsexecutescript() throws InterruptedException {
		driver.get("https://google.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//WebElement inputField= driver.findElement(By.name("btnK"));
		//inputField.clear();
		driver.findElement(By.name("q")).sendKeys("john");
		//String longstring="07054";
		//jse.executeScript("arguments[0].setAttribute('value', '" + longstring +"')", inputField);
		jse.executeScript("arguments[0].click();", driver.findElement(By.name("btnK")));
		//Thread.sleep(5000);
	}
	
	@Test
	public void hoverTestAmazonLogin() throws InterruptedException {
		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//driver.get("https://cars.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//WebElement hoverElement =  driver.findElement(By.xpath("(//a[@ aria-label=\"Choose a language for shopping.\"])[1]"));
		//Actions act = new Actions(driver);
		//act.moveToElement(hoverElement).perform();
		
		//act.dragAndDrop(driver.findElement(By.xpath("//header[text()='A']")),driver.findElement(By.xpath("//header[text()='B']"))).build().perform();
		//Thread.sleep(5000);
		Actions action=new Actions(driver);
		//action.click();
		
       // WebElement drag = driver.findElement(By.id("draggable"));
        //WebElement drop = driver.findElement(By.id("droppable"));
       // action.clickAndHold(drag).perform();
        //action.clickAndHold(drag).pause(Duration.ofSeconds(5)).release().perform();
     // action.contextClick(drag).perform();
        //action.dragAndDrop(drag, drop).build().perform();
		//action.doubleClick(drag).perform();
		//Point p = driver.findElement(By.id("draggable")).getLocation();
		//p.getX();
		//p.getY();
		//action.moveByOffset(p.getX(), p.getY());
		//action.scrollToElement(driver.findElement(By.xpath("//span[contains(text(),'Stream millions')]"))).perform();
		int scrolltimes = 1; 
		while(true) {
			try {
				if (driver.findElement(By.xpath("//a[@data-linkname='dealer-search-results']")).isDisplayed() ) {
					
				break;
				}
			} catch (Exception e) {
				scrolltimes++;//for negative scenario if the element is not visible
				if (scrolltimes == 15) {//15 is max scroll times
					break;
				}
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				// TODO: handle exception
			}
			
			
			
		}
		//action.keyDown()
	}
	
	
	
}
