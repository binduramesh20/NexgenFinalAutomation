package com.Nexgen.genericlib;
/**
 * @author bramesh
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	/**
	 * Used to handle the drop down
	 * @param ele
	 * @param text
	 */
	
	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	/**
	 * Used to perform mouse hovering
	 * @param driver
	 * @param ele
	 */
	public static void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	/**
	 * Used to handle pop ups
	 * @param driver
	 */
	public static void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * used to handle scroll action
	 * @param driver
	 * @param x
	 */
	
	public static void scrollBar(WebDriver driver, int x,int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

}
