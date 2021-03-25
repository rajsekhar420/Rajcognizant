package com.projectName.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.TestCases.rajBase;

public class raj_LoginPage extends rajBase {
	
	WebDriver idriver;
	
	public raj_LoginPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}	
  @FindBy (name="uid")
		  WebElement txtUserName;

  @FindBy (name="password")
  WebElement Pwd;
  
  @FindBy(name="btnLogin")

  WebElement Login;

  public void setusern(String username) {
	  txtUserName.sendKeys(username);
	  
  }

  public void setpassword(String userpassword) {
	  Pwd.sendKeys(userpassword);
	  
  }
  public void clickBtn() {
	  Login.click();
  }


}



