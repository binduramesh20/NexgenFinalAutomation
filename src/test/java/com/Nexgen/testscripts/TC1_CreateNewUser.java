package com.Nexgen.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.testng.annotations.Test;

import com.Nexgen.genericlib.BaseClass;
import com.Nexgen.genericlib.FileUtilities;
import com.Nexgen.pomrepository.pages.Login;
import com.Nexgen.pomrepository.pages.UserCreation;

public class TC1_CreateNewUser extends BaseClass{
	
	@Test
	public void newusercreation() throws FileNotFoundException, IOException, InterruptedException
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
		//uc.selectslider();
		//Thread.sleep(2000);
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
		//uc.nameofusercreated("usercreated");
	}
	
	

}
