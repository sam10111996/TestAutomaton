package com.sgtesting.sangeetha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInLogout {
	public static WebDriver OBrowser=null;
	public static void main(String[] args) {
		// Login and Logout From ActiTime Application
		launchBrowser();
		navigateURL();
		Login();
		minimizeFlyoutWindow();
		logout();
		closeApplication();
	}
		static void launchBrowser() 
		{
			String strPath=null;
			try 
			{
				strPath=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", strPath+ "\\Library\\drivers\\chromedriver.exe");
				OBrowser=new ChromeDriver();
				OBrowser.manage().window().maximize();
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		static void navigateURL() 
		{
			try 
			{
				OBrowser.get("http://localhost:81/login.do");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void Login() 
		{
			try 
			{
				OBrowser.findElement(By.name("username")).sendKeys("admin");
				Thread.sleep(2000);
				OBrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				OBrowser.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void minimizeFlyoutWindow() 
		{
			try 
			{
				OBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
				OBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		static void closeApplication() 
		{
			try
			{
				OBrowser.close();
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
}
