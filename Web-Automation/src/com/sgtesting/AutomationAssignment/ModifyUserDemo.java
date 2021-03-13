package com.sgtesting.AutomationAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserDemo {
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			//create user in actitime, perform modify and delete user and logout from application
			launchbrowser();
			navigate();
			login();
			createuser();
			modifyuser();
			deleteuser();
			LogoutAndClose();
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
				oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		static void createuser() 
		{
			try 
			{
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
				oBrowser.findElement(By.name("firstName")).sendKeys("test");
				oBrowser.findElement(By.name("lastName")).sendKeys("user");
				oBrowser.findElement(By.name("email")).sendKeys("testuser@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("testuser");
				oBrowser.findElement(By.name("password")).sendKeys("user");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("user");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
				Thread.sleep(2000);
				
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		static void modifyuser() 
		{
			try 
			{
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("testuser1");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(2000);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		static void deleteuser() 
		{
			try 
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		static void LogoutAndClose() 
		{
			try 
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
