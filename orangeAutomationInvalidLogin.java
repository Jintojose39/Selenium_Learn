package com.test.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeAutomationInvalidLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		
		Thread.sleep(1000);
		boolean check =driver.findElement(By.cssSelector("#spanMessage")).isDisplayed();
		
		
		if(check==true) {
			System.out.println("System showed an eror message(Login with invalid data)Test case is Passed.");
			
			System.out.println("Actual message:"+driver.findElement(By.cssSelector("#spanMessage")).getText());
			
			
		}else {
			
			
			System.out.println("(Login with invalid data) Test case is failed");
			
			
		}
		//Thread.sleep(2000);
		driver.close();
		


	}

}
