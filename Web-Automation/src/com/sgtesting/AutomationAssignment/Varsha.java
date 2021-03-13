package com.sgtesting.AutomationAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Varsha {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		createuser();
		deleteUser();
		logout();
		closeBrowser();
	}
	static void launchbrowser() 
	{
		String path=null;
		try 
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+ "\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void navigate() 
	{
		try 
		{
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createuser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("Varsha");
			oBrowser.findElement(By.name("lastName")).sendKeys("R");
			oBrowser.findElement(By.name("email")).sendKeys("varsha@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("varsha1");
			oBrowser.findElement(By.name("password")).sendKeys("varsha");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("varsha");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User created Sucessfully");
			System.out.println("****************************");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
//			Alert oAlert=oBrowser.switchTo().alert();
//			oAlert.accept();
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User deleted Sucessfully");
			System.out.println("***************************");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void logout() {
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void closeBrowser() {
		try {
			oBrowser.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
