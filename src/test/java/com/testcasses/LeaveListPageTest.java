package com.testcasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class LeaveListPageTest extends CommonMethods {
	
	@Test(groups="regression")
	public void leaveLabelValidation() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();
		
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
		click(login.loginBtn);
		jsClick(dashboard.leaveList);
		jsClick(dashboard.leaveLnk);
		
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(),"Lable is NOT displayed");
		
	}
	
	@Test(groups="regression")
	public void leaveLabelValidation1() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();
		
		login.login("Admin", "Hum@nhrm123");
		

	
	}
	
	}