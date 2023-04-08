package javaTpointTests;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverSelection.SelectBrowser;
import utils.DataUtil;

public class DataproviderTests extends SelectBrowser {

	
	@DataProvider(name="getData")
	public Iterator<Object[]> returnData() throws FileNotFoundException
	{
		  ArrayList<Object[]> testdata = null;
			testdata= DataUtil.getExcelData("TestDataExcel.xlsx","Sheet1");
			return testdata.iterator();
		
	}
	
	@Test(dataProvider = "getData")
	public void printData(String fname,String lname,String mobile)
	{
		driver.get("https://www.facebook.com/");
		System.out.println(fname+" "+lname+" "+mobile);
	
		driver.findElement(By.id("email")).sendKeys(fname);
		driver.findElement(By.id("pass")).sendKeys(lname);
		//driver.findElement(By.name("email")).sendKeys(mobile);//signup and create a form
		//driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
	}
	
	
}
