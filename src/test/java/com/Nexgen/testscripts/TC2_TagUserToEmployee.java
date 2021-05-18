package com.Nexgen.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.testng.annotations.Test;

import com.Nexgen.genericlib.BaseClass;
import com.Nexgen.genericlib.FileUtilities;
import com.Nexgen.pomrepository.pages.Login;
import com.Nexgen.pomrepository.pages.TagEmployeeToUser;
import com.Nexgen.pomrepository.pages.UserCreation;

public class TC2_TagUserToEmployee extends BaseClass {
	
	@Test
	public void employeeCreation() throws FileNotFoundException, IOException, InterruptedException
	{
		String nameuser;
		nameuser = "user" + new Random().nextInt(1000);
		Login l = new Login(driver);
		l.enterusername(FileUtilities.getdata("uname"));
		l.enterpassword(FileUtilities.getdata("pword"));
		l.clicklogin();
		
		UserCreation uc = new UserCreation(driver);
		uc.clicksettings();
		Thread.sleep(2000);
		uc.selectusers();
		Thread.sleep(2000);
		uc.selectslider();
		Thread.sleep(2000);
		uc.newuseroption();
		Thread.sleep(2000);
		uc.enterusernameforuser(nameuser);
		Thread.sleep(2000);
		uc.enternewuserpassword(FileUtilities.getdata("userpwd"));
		Thread.sleep(2000);
		uc.enteruseremail(FileUtilities.getdata("newuseremail"));
		Thread.sleep(2000);
		uc.selectuserdomain();
		Thread.sleep(2000);
		uc.selectuserprivilege();
		Thread.sleep(2000);
		uc.savenewuser();
		Thread.sleep(2000);
		String username = uc.nameofusercreated();
		
		TagEmployeeToUser tag = new TagEmployeeToUser(driver);
		tag.logo();
		Thread.sleep(2000);
		tag.resourceModule();
		Thread.sleep(2000);
		tag.employeeModule();
		Thread.sleep(2000);
		tag.emplistview();
		Thread.sleep(2000);
		tag.employeeSlider();
		Thread.sleep(2000);
		tag.newEmployeeoption();
		Thread.sleep(2000);
		tag.selectUser();
		Thread.sleep(2000);
		tag.enterUsertosearch(username);
		Thread.sleep(2000);
		//tag.selectcreateduserfrodropdown();
		//Thread.sleep(2000);
		tag.getUseridsearchtb();
		Thread.sleep(2000);
		tag.employeeFN("empfirstname");
		Thread.sleep(2000);
		tag.employeeLN("emplastname");
		Thread.sleep(2000);
		tag.supervisorselectcheckbox();
		Thread.sleep(1000);
		tag.leadworkerselectcheckbox();
		Thread.sleep(1000);
		tag.resourceselectcheckbox();
		Thread.sleep(1000);
		tag.commentsEmployee(FileUtilities.getdata("employeecommentscontent"));
		Thread.sleep(2000);
		tag.saveEmployee();
		Thread.sleep(2000);
		tag.employeenumbercreated();
		Thread.sleep(2000);
	
	}
	
	

}
