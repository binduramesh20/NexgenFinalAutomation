package com.Nexgen.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author bramesh
 *
 */

public class Login {
	/**
	 * Store element addresses for login page
	 */
	
	@FindBy(id="Email")
	private WebElement usernametb;
	
	@FindBy(id="Password")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String uname)
	{
		usernametb.sendKeys(uname);
	}
	public void enterpassword(String pword)
	{
		passwordtb.sendKeys(pword);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}

	public WebElement getUsernametb() {
		return usernametb;
	}

	public WebElement getPasswordtb() {
		return passwordtb;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
