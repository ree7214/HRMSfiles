package com.testcasses;

import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class AddEmployeePageTest extends CommonMethods {
	
	@Test
	public void verifyAddEmployee() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
		jsClick(login.loginBtn);
		jsClick(dashboard.pim);
		jsClick(dashboard.addEmp);
		
		
	}

}
