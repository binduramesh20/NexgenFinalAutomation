package com.Nexgen.genericlib;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * @author bramesh
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements AutoConstant{
	/**
	 * Used to open application
	 */
	public WebDriver driver;
	@BeforeMethod
	public void openApplication() throws FileNotFoundException, IOException
	{
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(FileUtilities.getdata("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * Used to close the application
	 * @throws IOException 
	 */
	@AfterMethod
	public void closeApplication(ITestResult r) throws IOException
	{
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			Screenshot.getScreenshot(driver, name);
		}
		driver.close();
	}

}
