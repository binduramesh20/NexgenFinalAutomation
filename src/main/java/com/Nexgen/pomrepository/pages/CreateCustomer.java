package com.Nexgen.pomrepository.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {
	
	@FindBy(xpath="(//span[text()='Customer'])[1]")
	private WebElement customermainmenuoption;
	
	@FindBy(xpath="(//span[@class='side_text'])[1]")
	private WebElement customersidemenuoption;
	
	@FindBy(xpath="//a[@title='List View']")
	private WebElement customerlistviewbtn;
	
	@FindBy(xpath="//a[@data-ng-click='vm.onCustomerAddNew()']")
	private WebElement customeraddnewbtn;
	
	@FindBy(id="CustomerFirstName")
	private WebElement customerfirstnametextbox;
	
	@FindBy(id="CustomerLastName")
	private WebElement customerlastnametextbox;
	
	@FindBy(id="CompanyName")
	private WebElement customercompanynametextbox;
	
	@FindBy(xpath="//button[@data-ng-click='vm.openAddressWindow()']")
	private WebElement addcustomeraddressbtn;
	
	@FindBy(id="Address1")
	private WebElement customeraddress1textbox;
	
	@FindBy(id="Address2")
	private WebElement customeraddress2textbox;
	
	@FindBy(id="Zip")
	private WebElement customeraddresszipcodetextbox;
	
	@FindBy(id="Phone1")
	private WebElement customerphone1textbox;
	
	@FindBy(xpath="//span[@aria-owns='AddressType_listbox']")
	private WebElement customeraddresstypedropdown;
	
	@FindBy(xpath="//li[text()='Owner']")
	private WebElement customeraddresstypeoption;
	
	@FindBy(xpath="//button[@data-commit-click='vm.saveAddres();']")
	private WebElement savecustomeraddressbtn;
	
	@FindBy(xpath="//button[@data-ng-click='vm.openAssetSelectionWindow()']")
	private WebElement customeraddassetbtn;
	
	@FindBy(xpath="//i[@class='nexgen-flow-tree']")
	private WebElement collapsetreeoptionbtn;
	
	@FindBy(id="SearchFilter")
	private WebElement assetsearchbtn;
	
	@FindBy(xpath="(//span[@class='k-input'])[9]")
	private WebElement searchparameterdropdown;
	
	@FindBy(xpath="(//li[text()='Number'])[2]")
	private WebElement searchparameternumber;
	
	@FindBy(xpath="(//input[@name='SearchTextBox'])[2]")
	private WebElement assetsearchtextbox;
	
	@FindBy(xpath="(//span[@class='input-group-btn'])[2]")
	private WebElement searchiconbtn;
	
	@FindBy(xpath="//input[@data-ng-checked='vm.selectedItem.indexOf(105576) > -1']")
	private WebElement selectcustomerassetbtn;
	
	@FindBy(xpath="//button[@data-commit-click='vm.onAssetSearchSave();']")
	private WebElement attachcustomerassetbtn;
	
	@FindBy(xpath="//a[@data-commit-click='vm.saveCustomer()']")
	private WebElement savecustomerbtn;
	
	public CreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customermenuoption()
	{
		customermainmenuoption.click();
	}
	
	public void customersideoption()
	{
		customersidemenuoption.click();
	}
	
	public void customerlistview()
	{
		customerlistviewbtn.click();
	}
	
	public void addnewcustomer()
	{
		customeraddnewbtn.click();
	}
	
	public void customerfirstname(String custFN)
	{
		custFN = "CustomerFirstName" + new Random().nextInt(1000);
		customerfirstnametextbox.sendKeys(custFN);
	}
	
	public void customerlastname(String custLN)
	{
		custLN = "CustomerLastName" + new Random().nextInt(1000);
		customerlastnametextbox.sendKeys(custLN);
		
	}
	
	public void customercompanyname(String custcompanyname)
	{
		custcompanyname = "CompanyName" + new Random().nextInt(1000);
		customercompanynametextbox.sendKeys(custcompanyname);
	}
	
	public void customeraddressadd()
	{
		addcustomeraddressbtn.click();
	}
	
	public void customerfirstaddressfield(String customeraddress1)
	{
		customeraddress1textbox.sendKeys(customeraddress1);
	}
	
	public void customersecondaddressfield(String customeraddress2)
	{
		customeraddress2textbox.sendKeys(customeraddress2);
	}
	
	public void customeraddresszipfield(String customerzip)
	{
		customeraddresszipcodetextbox.sendKeys(customerzip);
	}
	
	public void customerphonenumber(String customerphone)
	{
		customerphone1textbox.sendKeys(customerphone);
	}
	
	public void customeraddresstype()
	{
		customeraddresstypedropdown.click();
	}
	
	public void customeraddresstypeoption()
	{
		customeraddresstypeoption.click();
	}
	
	public void savecustomeraddress()
	{
		savecustomeraddressbtn.click();
	}
	
	public void addcustomerassetbtn()
	{
		customeraddassetbtn.click();
	}
	
	
	public void collapsetreesearch()
	{
		collapsetreeoptionbtn.click();
	}
	
	public void searchoptiontoddasset()
	{
		assetsearchbtn.click();
	}
	
	public void searchdropdownoptions()
	{
		searchparameterdropdown.click();
	}
	
	public void selectnumber()
	{
		searchparameternumber.click();
	}
	
	public void searchtextbox(String assettoattachforcustomer)
	{
		assetsearchtextbox.sendKeys(assettoattachforcustomer);
	}
	
	public void searchiconforasset()
	{
		searchiconbtn.click();
	}
	
	public void selectassetforcustomer()
	{
		selectcustomerassetbtn.click();
	}
	
	public void attachcustomerasset()
	{
		attachcustomerassetbtn.click();
	}
	
	public void savecustomer()
	{
		savecustomerbtn.click();
	}

	public WebElement getCustomermainmenuoption() {
		return customermainmenuoption;
	}

	public WebElement getCustomersidemenuoption() {
		return customersidemenuoption;
	}

	public WebElement getCustomeraddnewbtn() {
		return customeraddnewbtn;
	}

	public WebElement getCustomerfirstnametextbox() {
		return customerfirstnametextbox;
	}

	public WebElement getCustomerlastnametextbox() {
		return customerlastnametextbox;
	}

	public WebElement getCustomercompanynametextbox() {
		return customercompanynametextbox;
	}

	public WebElement getAddcustomeraddressbtn() {
		return addcustomeraddressbtn;
	}

	public WebElement getCustomeraddress1textbox() {
		return customeraddress1textbox;
	}

	public WebElement getCustomeraddress2textbox() {
		return customeraddress2textbox;
	}

	public WebElement getCustomeraddresszipcodetextbox() {
		return customeraddresszipcodetextbox;
	}

	public WebElement getCustomerphone1textbox() {
		return customerphone1textbox;
	}

	public WebElement getCustomeraddresstypedropdown() {
		return customeraddresstypedropdown;
	}

	public WebElement getCustomeraddresstypeoption() {
		return customeraddresstypeoption;
	}

	public WebElement getSavecustomeraddressbtn() {
		return savecustomeraddressbtn;
	}

	public WebElement getCustomeraddassetbtn() {
		return customeraddassetbtn;
	}

	public WebElement getSelectcustomerassetbtn() {
		return selectcustomerassetbtn;
	}

	public WebElement getAttachcustomerassetbtn() {
		return attachcustomerassetbtn;
	}

	public WebElement getSavecustomerbtn() {
		return savecustomerbtn;
	}

	public WebElement getCustomerlistviewbtn() {
		return customerlistviewbtn;
	}

	public WebElement getCollapsetreeoptionbtn() {
		return collapsetreeoptionbtn;
	}

	public WebElement getSearchparameterdropdown() {
		return searchparameterdropdown;
	}

	public WebElement getSearchparameternumber() {
		return searchparameternumber;
	}

	public WebElement getSearchiconbtn() {
		return searchiconbtn;
	}
	
}
