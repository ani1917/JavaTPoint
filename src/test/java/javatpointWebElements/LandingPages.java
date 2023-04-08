package javatpointWebElements;

import org.openqa.selenium.By;
//a[text()='Inputs']
public interface LandingPages {
	public static final By makeusedornew = By.xpath("//select[@name = 'stock_type'  and @id = 'make-model-search-stocktype']");
	public static final By makezip = By.xpath("//input[@name = 'zip' and @id = 'make-model-zip' ] ");
	public static final By makesearchbtn = By.xpath("//button[@type = 'submit' and @data-searchtype='make']");
	public static final By searchScrollText = By.xpath("//h2[starts-with(text(),'The latest new')]");		
	public static final By findDealer =By.xpath("//a[@href='/dealers/buy/']");
}


