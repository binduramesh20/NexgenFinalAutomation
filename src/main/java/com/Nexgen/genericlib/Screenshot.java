package com.Nexgen.genericlib;
/**
 * @author bramesh
 */

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * Used to take screenshots of failed test cases
 * @author bramesh
 *
 */
public class Screenshot {
	
	public static String getScreenshot(WebDriver driver, String name) throws IOException
	{
		Date d = new Date();
		String date = d.toString().replaceAll(":", "-");
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.screenshotpath+date+name+" .png");
		FileUtils.copyFile(src, dest);
		return date;
		
	}

}
