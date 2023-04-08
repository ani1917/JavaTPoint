package driverSelection;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import actionsInPages.CarShoppingPage;
import actionsInPages.DealerPageHeader;
import actionsInPages.LandingPagesActions;

public class SelectBrowser {

  public WebDriver driver;
  public LandingPagesActions landpgact;
  public CarShoppingPage cshpg;
  public DealerPageHeader dealerHeader;
  public void selectBrowser(String browserselection) {
	  if(browserselection.equals("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if (browserselection.equals("firefox")) {
		  driver = new FirefoxDriver();
			}
	  else
	  {
		  driver = new EdgeDriver();
	  }
  }
  
  @BeforeMethod
  public void browseractionsopen() {
	//  System.out.println("**********before method******");
	  selectBrowser("chrome");
	  driver.get("https://www.cars.com/");
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 landpgact = new LandingPagesActions(driver);
		 cshpg = new CarShoppingPage(driver);
		 dealerHeader =  new DealerPageHeader(driver);
  }
  @AfterMethod
  public void browseractionsclose() {
	  driver.manage().window().minimize();
	  //driver.close();
  }
}
