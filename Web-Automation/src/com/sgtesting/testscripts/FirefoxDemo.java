package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		logout();
	}
	static void LaunchBrowser() 
	{
		String path=null;
		try 
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",path+"\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void navigate() 
	{
		try 
		{
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			oBrowser.findElement(By.name("lastName")).sendKeys("test");
			oBrowser.findElement(By.name("email")).sendKeys("testuser@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("testuser");
			oBrowser.findElement(By.name("password")).sendKeys("user");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try 
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			oBrowser.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
