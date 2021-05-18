package com.Nexgen.pomrepository.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author bramesh
 *
 */

public class UserCreation {
	/**
	 * Elements for creating a new user
	 */
	
	@FindBy(xpath="//i[@class='nexgen-setup']")
	private WebElement settingsmenuoption;
	
	@FindBy(xpath="//div[@class='tile-icon nexgen-user']")
	private WebElement useroption;
	
	@FindBy(id="slider-check")
	private WebElement slider;
	
	@FindBy(xpath="//a[@data-ng-click='vm.userAdd()']")
	private WebElement newuser;
	
	@FindBy(id="UserName")
	private WebElement newusername;
	
	@FindBy(id="Password")
	private WebElement userpassword;
	
	@FindBy(id="Email")
	private WebElement useremail;
	
	@FindBy(xpath="(//span[text()='City'])[2]")
	private WebElement userprivilegedomain;
	
	@FindBy(id="userPrivilege-11")
	private WebElement userprivilege;
	
	@FindBy(xpath="//a[@data-commit-click='vm.saveUser()']")
	private WebElement saveuser;
	
	@FindBy(xpath="//h2[@data-ng-bind='vm.user.UserName']")
	private WebElement usercreatedname;
	
	public UserCreation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicksettings()
	{
		settingsmenuoption.click();
	}
	public void selectusers()
	{
		useroption.click();
	}
	public void selectslider()
	{
	
		slider.click();
	}
	 
	public void newuseroption()
	{
			newuser.click();
	}
	public void enterusernameforuser(String nameuser)
	{
		nameuser = "user" + new Random().nextInt(1000);
		newusername.sendKeys(nameuser);
	}
	public void enternewuserpassword(String userpwd)
	{
		userpassword.sendKeys(userpwd);
	}
	public void enteruseremail(String newuseremail)
	{
		useremail.sendKeys(newuseremail);
	}
	public void selectuserdomain()
	{
		userprivilegedomain.click();
	}
	public void selectuserprivilege()
	{
		userprivilege.click();
	}
	public void savenewuser()
	{
		saveuser.click();
	}
	
	public String nameofusercreated()
	{
		String usercreated;
		usercreated = usercreatedname.getText();
		System.out.println(usercreated);
		return usercreated;
	}
		

	public WebElement getSettingsmenuoption() {
		return settingsmenuoption;
	}

	public WebElement getUseroption() {
		return useroption;
	}

	public WebElement getNewuser() {
		return newuser;
	}

	public WebElement getNewusername() {
		return newusername;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public WebElement getUserprivilegedomain() {
		return userprivilegedomain;
	}

	public WebElement getUserprivilege() {
		return userprivilege;
	}

	public WebElement getSaveuser() {
		return saveuser;
	}

	public WebElement getUsercreatedname() {
		return usercreatedname;
	}

	public WebElement getSlider() {
		return slider;
	}

}
