package com.test.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeAutomationValidLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		
		Thread.sleep(4000);
		boolean check =driver.findElement(By.cssSelector("#branding > a:nth-child(1) > img")).isDisplayed();
		
		System.out.println(check);
		
		
		if(check=true) {
			System.out.println("(Logo showing)Test is Passed");
		}else {
			
			System.out.println("(Logo showing)Test is Failed");
		}
		

		String exp2="Admin";
		
		String act2 =driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).getText();
		
		

		if(exp2.equals(act2)) {
			System.out.println("(Admin button showing)Test is Passed");
			
			
		}
		
		else {
			System.out.println("Test is Failed");
		}
		
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Jinto");
		
		driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Jinto");
		
		driver.findElement(By.cssSelector("#searchBtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"resetBtn\"]")).click();
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
}
}
