package com.testcasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class LoginPageTest extends CommonMethods {
	@Test(groups="smoke")
	public void login() {

		LoginPage login = new LoginPage();
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@hrrm123");
		click(login.loginBtn);

	}

	@Test(groups="regression")
	public void negativeLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, "Admin");
		click(login.loginBtn);
		String expected = "Password cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message is not matched");

	}
}
