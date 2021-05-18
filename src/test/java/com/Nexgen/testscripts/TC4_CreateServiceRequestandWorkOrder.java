package com.Nexgen.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Nexgen.genericlib.BaseClass;
import com.Nexgen.genericlib.FileUtilities;
import com.Nexgen.pomrepository.pages.CreateServiceRequestandWorkOrder;
import com.Nexgen.pomrepository.pages.Login;

public class TC4_CreateServiceRequestandWorkOrder extends BaseClass{
	
	@Test
	public void servicerequestcreation() throws FileNotFoundException, IOException, InterruptedException
	{
		Login l = new Login(driver);
		l.enterusername(FileUtilities.getdata("uname"));
		l.enterpassword(FileUtilities.getdata("pword"));
		l.clicklogin();
		
		CreateServiceRequestandWorkOrder src = new CreateServiceRequestandWorkOrder(driver);
		src.customermenuoption();
		Thread.sleep(2000);
		src.servicerequestmenuoption();
		Thread.sleep(2000);
		src.servicerequestlistview();
		Thread.sleep(2000);
		src.servicerequestslideroption();
		Thread.sleep(2000);
		src.addnewservicerequest();
		Thread.sleep(2000);
		src.servicerequeststartdatecalendar();
		Thread.sleep(2000);
		src.servicerequeststartdate();
		Thread.sleep(2000);
		src.servicerequestenddatecalendar();
		Thread.sleep(2000);
		src.servicerequestenddate();
		Thread.sleep(2000);
		src.servicerequesttype();
		Thread.sleep(2000);
		src.servicerequestdescription(FileUtilities.getdata("servicerequestdescriptioncontent"));
		Thread.sleep(2000);
		src.getSrsupervisordropdown();
		Thread.sleep(2000);
		src.servicerequestaddress(FileUtilities.getdata("servicerequestaddress1"));
		Thread.sleep(2000);
		src.servicerequestzip(FileUtilities.getdata("servicerequestzip"));
		Thread.sleep(2000);
		src.servicerequestcustomerlastname("srcustlastname");
		Thread.sleep(2000);
		src.srcustomeraddress(FileUtilities.getdata("servicerequestcustomeraddress"));
		Thread.sleep(2000);
		src.srcustomerzipcode(FileUtilities.getdata("srcustomerzipcode"));
		Thread.sleep(2000);
		src.saveservicerequest();
		Thread.sleep(5000);
		src.createdservicerequestnumber();
		Thread.sleep(2000);
		src.servicerequestaction();
		Thread.sleep(2000);
		src.newworkorderoption();
		Thread.sleep(2000);
		src.alertokbtn();
		Thread.sleep(4000);
		src.addchecklistoption();
		Thread.sleep(2000);
		src.checklistname();
		Thread.sleep(2000);
		src.checklistdescription();
		Thread.sleep(2000);
		src.savechecklist();
		Thread.sleep(2000);
		src.saveworkorderfromservicerequest();
		Thread.sleep(5000);
		src.navigateservicerequest(driver);
		Thread.sleep(4000);
		src.user();
		Thread.sleep(2000);
		src.logout();
		Thread.sleep(3000);
				
	}

}
