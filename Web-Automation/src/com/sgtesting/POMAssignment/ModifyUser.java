package com.sgtesting.POMAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// Create and delete user 
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createuser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	static void launchBrowser() 
	{
		String path=null;
		try 
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+ "\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser); 
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void navigate() 
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			oBrowser.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyoutWindow() 
	{
		try
		{
			oPage.getFlyoutWindow().click();
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
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
			oPage.getLogoutLink().click();
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
			oBrowser.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createuser() {
		try
		{
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("user");
			oPage.getlastname().sendKeys("demo");
			oPage.getEmail().sendKeys("userdemo123@gmail.com");
			oPage.getNewUserName().sendKeys("userdemo");
			oPage.getnewuserpassword().sendKeys("welcome");
			oPage.getReEnterpassword().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getcreatebutton().click();
			System.out.println("User Created");
			System.out.println("************");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser() 
	{
		try 
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getNewUserName().clear();
			Thread.sleep(2000);
			oPage.getNewUserName().sendKeys("userdemo1");
			Thread.sleep(2000);
			oPage.getsavechanges().click();
			System.out.println("User Modified");
			System.out.println("*************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser() {
		try {
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User Deleted");
			System.out.println("************");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
