package com.Nexgen.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Nexgen.genericlib.BaseClass;
import com.Nexgen.genericlib.FileUtilities;
import com.Nexgen.pomrepository.pages.CreateCustomer;
import com.Nexgen.pomrepository.pages.Login;

public class TC3_CreateNewCustomer extends BaseClass{
	
	@Test
	public void customercreation() throws FileNotFoundException, IOException, InterruptedException 
	{
		Login l = new Login(driver);
		l.enterusername(FileUtilities.getdata("uname"));
		l.enterpassword(FileUtilities.getdata("pword"));
		l.clicklogin();
		
		CreateCustomer cc = new CreateCustomer(driver);
		
		cc.customermenuoption();
		Thread.sleep(2000);
		cc.customersideoption();
		Thread.sleep(2000);
		cc.customerlistview();
		Thread.sleep(2000);
		cc.addnewcustomer();
		Thread.sleep(2000);
		cc.customerfirstname("custFN");
		Thread.sleep(2000);
		cc.customerlastname("custLN");
		Thread.sleep(2000);
		cc.customercompanyname("custcompanyname");
		Thread.sleep(2000);
		cc.customeraddressadd();
		Thread.sleep(2000);
		cc.customerfirstaddressfield(FileUtilities.getdata("customeraddress1"));
		Thread.sleep(2000);
		cc.customersecondaddressfield(FileUtilities.getdata("customeraddress2"));
		Thread.sleep(2000);
		cc.customeraddresszipfield(FileUtilities.getdata("customerzip"));
		Thread.sleep(2000);
		cc.customerphonenumber(FileUtilities.getdata("customerphone"));
		Thread.sleep(2000);
		cc.customeraddresstype();
		Thread.sleep(2000);
		cc.customeraddresstypeoption();
		Thread.sleep(2000);
		cc.savecustomeraddress();
		Thread.sleep(2000);
		cc.addcustomerassetbtn();
		Thread.sleep(2000);
		cc.collapsetreesearch();
		Thread.sleep(2000);
		cc.searchoptiontoddasset();
		Thread.sleep(2000);
		cc.searchdropdownoptions();
		Thread.sleep(2000);
		cc.selectnumber();
		Thread.sleep(2000);
		cc.searchtextbox(FileUtilities.getdata("assettoattachforcustomer"));
		Thread.sleep(2000);
		cc.searchiconforasset();
		Thread.sleep(2000);
		cc.selectassetforcustomer();
		Thread.sleep(2000);
		cc.attachcustomerasset();
		Thread.sleep(2000);
		cc.savecustomer();
		Thread.sleep(2000);
		
	}

}
