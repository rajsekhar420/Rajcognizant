package com.Project.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testing {
	@Test
	public void te() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("testing");
		driver.navigate().back();
		
	  driver.get("http://demo.guru99.com/v4/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("mngr316131");
		driver.findElement(By.name("password")).sendKeys("pupavUs");
		driver.findElement(By.name("btnLogin")).click();
		driver.quit();
	}

}
