package com.Nexgen.pomrepository.pages;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nexgen.genericlib.FileUtilities;

public class CreateServiceRequestandWorkOrder {
	
	@FindBy(xpath="//span[text()='Customer']")
	private WebElement customermainoption;
	
	@FindBy(xpath="//span[text()='Service Request']")
	private WebElement servicerequestmenuoptionbtn;
	
	@FindBy(xpath="//a[@data-ui-sref='ServiceRequest.List']")
	private WebElement servicereqlistviewbtn;
	
	@FindBy(xpath="//a[@data-ng-click='vm.onSRAddNew()']")
	private WebElement newservicerequestbtn;
	
	@FindBy(id="slider-check")
	private WebElement servicerequestsliderbtn;
	
	@FindBy(xpath="//span[@aria-controls='StartDate_dateview']")
	private WebElement startdatecalendarbtn;
	
	@FindBy(xpath="(//td[@aria-selected='true'])[1]")
	private WebElement currentdatetostart;
	
	@FindBy(xpath="//span[@aria-controls='CompletionDate_dateview']")
	private WebElement enddatecalendarbtn;
	
	/**@FindBy(xpath="(//span[@class='k-icon k-i-arrow-60-right'])[2]")
	private WebElement nexticoncalendar;**/
	
	@FindBy(xpath="(//td[@aria-selected='true'])[2]")
	private WebElement currentdatetoend;
	
	@FindBy(xpath="//span[@aria-owns='SRTypeID_listbox']")
	private WebElement srtypedropdownbox;
	
	@FindBy(id="SRDescription")
	private WebElement srdescriptiontb;
	
	@FindBy(xpath="//span[@aria-owns='Supervisor_listbox']")
	private WebElement srsupervisordropdown;
	
	@FindBy(xpath="(//input[@id='Address1'])[1]")
	private WebElement sraddress1tb;
	
	@FindBy(xpath="(//input[@id='Zip'])[1]")
	private WebElement srziptb;
	
	@FindBy(id="CustomerLastName")
	private WebElement srcustomerlastnametb;
	
	@FindBy(xpath="(//input[@id='Address1'])[2]")
	private WebElement srcustomeraddress1tb;
	
	@FindBy(xpath="(//input[@id='Zip'])[2]")
	private WebElement srcustomerziptb;
	
	@FindBy(xpath="//a[@data-commit-click='vm.saveServiceRequest()']")
	private WebElement savesrbtn;
	
	@FindBy(xpath="//span[@data-value='vm.serviceRequest.SRNumber']")
	private WebElement servicerequestnumber;
	
	@FindBy(xpath="//button[@data-ng-click='vm.dropDownFixPosition($event)']")
	private WebElement actionbtn;
	
	@FindBy(xpath="//a[@data-ng-click='vm.onSRToWOOpen()']")
	private WebElement newworkorderfromservicerequest;
	 
	@FindBy(xpath="//button[@data-commit-click='vm.onCreateWOFromSR();']")
	private WebElement servicerequestokbtn;
	 
	@FindBy(xpath="//button[@data-ng-click='vm.openWorkOrderCheckListWindow();']")
	private WebElement addchecklistbtn;
	 
	@FindBy(id="CheckListText")
	private WebElement checklistnametxtbox;
	 
	@FindBy(id="CheckListDescription")
	private WebElement checklistdescriptiontextbox;
	
	@FindBy(xpath="//button[@data-commit-click='vm.onWOCheckListSave();']")
	private WebElement savechecklistbtn;
	 
	@FindBy(xpath="//a[@data-commit-click='vm.onWOSave()']")
	private WebElement saveworkorderbtn;
	 
	@FindBy(xpath="//a[@data-ng-click='vm.onSRLinkClick(vm.SRDetails.SRID)']")
	private WebElement servicerequestparent;
	 
	@FindBy(xpath="//div[@class='user-name']")
	private WebElement userbtn;
	 
	@FindBy(xpath="//a[text()=' Logout']")
	private WebElement logoutbtn;
	 
	
	public CreateServiceRequestandWorkOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customermenuoption()
	{
		customermainoption.click();
	}
	
	public void servicerequestmenuoption()
	{
		servicerequestmenuoptionbtn.click();
	}
	
	public void servicerequestlistview()
	{
		servicereqlistviewbtn.click();
	}
	
	public void servicerequestslideroption()
	{
		servicerequestsliderbtn.click();
	}
	
	public void addnewservicerequest()
	{
		newservicerequestbtn.click();
	}
	
	public void servicerequeststartdatecalendar()
	{
		startdatecalendarbtn.click();
	}
	
	public void servicerequeststartdate()
	{
		currentdatetostart.click();
	}
	
	public void servicerequestenddatecalendar()
	{
		enddatecalendarbtn.click();
	}
	
	public void servicerequestenddate()
	{
		currentdatetoend.click();
	}
	
	public void servicerequesttype()
	{
		srtypedropdownbox.click();
		srtypedropdownbox.sendKeys(Keys.ARROW_DOWN);
		srtypedropdownbox.sendKeys(Keys.ENTER);
	}
	
	public void servicerequestdescription(String servicerequestdescriptioncontent)
	{
		srdescriptiontb.sendKeys(servicerequestdescriptioncontent);
	}
	
	public void srsupervisordropdown()
	{
		srsupervisordropdown.click();
	}
	
	public void servicerequestaddress(String servicerequestaddress1)
	{
		sraddress1tb.sendKeys(servicerequestaddress1);
	}
	
	public void servicerequestzip(String servicerequestzip)
	{
		srziptb.sendKeys(servicerequestzip);
	}
	
	public void servicerequestcustomerlastname(String srcustlastname)
	{
		srcustlastname = "SRCustomerLastName" + new Random().nextInt(1000);
		srcustomerlastnametb.sendKeys(srcustlastname);
	}
	
	public void srcustomeraddress(String servicerequestcustomeraddress)
	{
		srcustomeraddress1tb.sendKeys(servicerequestcustomeraddress);
	}
	
	public void srcustomerzipcode(String srcustomerzipcode)
	{
		srcustomerziptb.sendKeys(srcustomerzipcode);
	}
	
	public void saveservicerequest()
	{
		savesrbtn.click();
	}
	
	public void createdservicerequestnumber()
	{
		String srcreated = servicerequestnumber.getText();
		System.out.println(srcreated);
	}
	
	public void servicerequestaction()
	{
		actionbtn.click();
	}
	
	public void newworkorderoption()
	{
		newworkorderfromservicerequest.click();
	}
	
	public void alertokbtn()
	{
		servicerequestokbtn.click();
	}
	
	public void addchecklistoption()
	{
		addchecklistbtn.click();
	}
	
	public void checklistname()
	{
		//Random r = new Random();
		String checklistcontent = "Test Checklist - " + new Random().nextInt(1000);
		checklistnametxtbox.sendKeys(checklistcontent);
	}
	
	public void checklistdescription()
	{
		String checklistdescriptioncontent = "Test Checklist Description - " + new Random().nextInt(1000);
		checklistdescriptiontextbox.sendKeys(checklistdescriptioncontent);
	}
	
	public void savechecklist()
	{
		savechecklistbtn.click();
	}
	
	public void saveworkorderfromservicerequest()
	{
		saveworkorderbtn.click();
	}
	
	public void navigateservicerequest(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		servicerequestparent.click();
		//"document.body.scrollHeight" returns the complete height of the body i.e web page.
	}
	
	public void user()
	{
		userbtn.click();
	}
	
	public void logout()
	{
		logoutbtn.click();
	}

	public WebElement getCustomermainoption() {
		return customermainoption;
	}

	public WebElement getServicerequestmenuoptionbtn() {
		return servicerequestmenuoptionbtn;
	}

	public WebElement getServicereqlistviewbtn() {
		return servicereqlistviewbtn;
	}

	public WebElement getNewservicerequestbtn() {
		return newservicerequestbtn;
	}

	public WebElement getStartdatecalendarbtn() {
		return startdatecalendarbtn;
	}

	public WebElement getCurrentdatetostart() {
		return currentdatetostart;
	}

	public WebElement getEnddatecalendarbtn() {
		return enddatecalendarbtn;
	}

	public WebElement getCurrentdatetoend() {
		return currentdatetoend;
	}

	public WebElement getSrtypedropdownbox() {
		return srtypedropdownbox;
	}

	public WebElement getSrdescriptiontb() {
		return srdescriptiontb;
	}

	public WebElement getSrsupervisordropdown() {
		return srsupervisordropdown;
	}

	public WebElement getSraddress1tb() {
		return sraddress1tb;
	}

	public WebElement getSrziptb() {
		return srziptb;
	}

	public WebElement getSrcustomerlastnametb() {
		return srcustomerlastnametb;
	}

	public WebElement getSrcustomeraddress1tb() {
		return srcustomeraddress1tb;
	}

	public WebElement getSrcustomerziptb() {
		return srcustomerziptb;
	}

	public WebElement getSavesrbtn() {
		return savesrbtn;
	}

	public WebElement getServicerequestnumber() {
		return servicerequestnumber;
	}

	public WebElement getActionbtn() {
		return actionbtn;
	}

	public WebElement getNewworkorderfromservicerequest() {
		return newworkorderfromservicerequest;
	}

	public WebElement getServicerequestokbtn() {
		return servicerequestokbtn;
	}

	public WebElement getAddchecklistbtn() {
		return addchecklistbtn;
	}

	public WebElement getChecklistnametxtbox() {
		return checklistnametxtbox;
	}

	public WebElement getChecklistdescriptiontextbox() {
		return checklistdescriptiontextbox;
	}

	public WebElement getSavechecklistbtn() {
		return savechecklistbtn;
	}

	public WebElement getSaveworkorderbtn() {
		return saveworkorderbtn;
	}

	public WebElement getServicerequestparent() {
		return servicerequestparent;
	}

	public WebElement getUserbtn() {
		return userbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	

}
