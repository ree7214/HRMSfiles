package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hrms.testbase.BaseClass;

public class AddEmployeePage extends BaseClass {
	
	@Test
	public void addEmployee() {
		driver.findElement(By.id("firstName"));
		driver.findElement(By.id("middleName"));
	}

}
