package com.Project.TestCases;

import org.testng.annotations.Test;

import com.projectName.PageObjects.raj_LoginPage;

public class raj_Test_001 extends rajBase {

	
	@Test
	public void loginTest() {
		driver.get(baseURL);

	
	raj_LoginPage rl=new raj_LoginPage(driver);
	rl.setusern(userName);
	rl.setpassword(password);
	rl.clickBtn();
	
	}
}
