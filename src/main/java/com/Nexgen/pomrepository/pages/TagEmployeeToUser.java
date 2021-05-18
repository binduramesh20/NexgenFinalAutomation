package com.Nexgen.pomrepository.pages;

import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagEmployeeToUser {
	
	@FindBy(xpath="//span[@class='nexgen-logo']")
	private WebElement nexgenlogo;
	
	@FindBy(xpath="//span[@class='nexgen-resource']")
	private WebElement resourcemenuoption;
	
	@FindBy(xpath="//span[text()='Employee']")
	private WebElement employeesidemenuoption;
	
	@FindBy(id="slider-check")
	private WebElement employeeslider;
	
	@FindBy(xpath="//a[@title='List View']")
	private WebElement employeelistbtn;
	
	@FindBy(xpath="//a[@data-ng-click='vm.onEmployeeAdd()']")
	private WebElement addnewemployee;
	
	@FindBy(xpath="//span[@aria-owns='UserID_listbox']")
	private WebElement selectuserid;
	
	@FindBy(xpath="//input[@aria-owns='UserID_listbox']")
	private WebElement useridsearchtb;
	
	/**call nameofusercreated from UserCreation
	//@FindBy(xpath="(//li[@tabindex='-1'])[13]")
	//private WebElement selectuseraftersearch;**/
	
	@FindBy(id="FirstName")
	private WebElement employeefirstname;
	
	@FindBy(id="LastName")
	private WebElement employeelastname;
	
	@FindBy(id="IsSupervisor")
	private WebElement supervisorcheckbox;
	
	@FindBy(id="IsLeadWorker")
	private WebElement leadworkercheckbox;
	
	@FindBy(id="IsResource")
	private WebElement resourcecheckbox;
	
	@FindBy(xpath="//textarea[@id='Comments']")
	private WebElement employeecomments;
	
	@FindBy(xpath="//a[@data-commit-click='vm.saveEmployee()']")
	private WebElement saveemployeebtn;
	
	@FindBy(xpath="//span[@data-value='vm.employee.EmployeeNumber']")
	private WebElement employeenumber;
	
	public TagEmployeeToUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logo()
	{
		nexgenlogo.click();
	}
	
	public void resourceModule()
	{
		resourcemenuoption.click();
	}
	
	public void employeeModule()
	{
		employeesidemenuoption.click();
	}
	
	public void employeeSlider()
	{
		employeeslider.click();
	}
	public void emplistview()
	{
		employeelistbtn.click();
	}
	public WebElement getEmployeelistbtn() {
		return employeelistbtn;
	}

	public void newEmployeeoption()
	{
		addnewemployee.click();
	}
	
	public void selectUser()
	{
		selectuserid.click();
		
	}
	
	public void enterUsertosearch(String usercreated) throws InterruptedException
	{
		useridsearchtb.sendKeys(usercreated);
		Thread.sleep(2000);
		useridsearchtb.sendKeys(Keys.ARROW_DOWN);
		useridsearchtb.sendKeys(Keys.ENTER);
	}
	
	/**public void selectcreateduserfrodropdown()
	{
		selectuseraftersearch.sendKeys(Keys.ENTER);
	}**/
	
	public WebElement getUseridsearchtb() {
		return useridsearchtb;
	}

	public void employeeFN(String empfirstname)
	{
		empfirstname = "FirstName" + new Random().nextInt(1000);
		employeefirstname.sendKeys(empfirstname);
	}
	
	public void employeeLN(String emplastname)
	{
		emplastname = "LastName" + new Random().nextInt(1000);
		employeelastname.sendKeys(emplastname);
	}
	
	public void supervisorselectcheckbox()
	{
		supervisorcheckbox.click();
	}
	
	public void leadworkerselectcheckbox()
	{
		leadworkercheckbox.click();
	}
	
	public void resourceselectcheckbox()
	{
		resourcecheckbox.click();
	}
	
	public void commentsEmployee(String employeecommentscontent)
	{
		employeecomments.sendKeys(employeecommentscontent);
	}
	
	public void saveEmployee()
	{
		saveemployeebtn.click();
	}
	
	public void employeenumbercreated()
	{
		employeenumber.getText();
	}

	public WebElement getResourcemenuoption() {
		return resourcemenuoption;
	}

	public WebElement getEmployeesidemenuoption() {
		return employeesidemenuoption;
	}

	/**public WebElement getSlider() {
		return slider;
	}**/

	public WebElement getAddnewemployee() {
		return addnewemployee;
	}

	public WebElement getSelectuserid() {
		return selectuserid;
	}

	public WebElement getEmployeefirstname() {
		return employeefirstname;
	}

	public WebElement getEmployeelastname() {
		return employeelastname;
	}

	public WebElement getSupervisorcheckbox() {
		return supervisorcheckbox;
	}

	public WebElement getLeadworkercheckbox() {
		return leadworkercheckbox;
	}

	public WebElement getResourcecheckbox() {
		return resourcecheckbox;
	}

	public WebElement getSaveemployeebtn() {
		return saveemployeebtn;
	}

	public WebElement getEmployeecomments() {
		return employeecomments;
	}

	public WebElement getEmployeenumber() {
		return employeenumber;
	}

	/**public WebElement getSelectuseraftersearch() {
		return selectuseraftersearch;**/
	}
	
	
	


