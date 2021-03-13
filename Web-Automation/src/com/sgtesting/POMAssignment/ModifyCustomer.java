package com.sgtesting.POMAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomer {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// create modify and delete customer
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
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
	
	static void createcustomer()
	{
		try 
		{
			oPage.getTaskbutton().click();
			Thread.sleep(2000);
			oPage.getAddnew().click();
			oPage.getnewcustomer().click();
			Thread.sleep(2000);
			oPage.getnameofcustomer().sendKeys("Demo Customer");
			Thread.sleep(2000);
			oPage.getcreatecustomer().click();
			System.out.println("Customer Created");
			System.out.println("****************");
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void modifycustomer() 
	{
		try 
		{
			oPage.getcustomersettings().click();
			Thread.sleep(1000);
			oPage.getCustomerDescription().sendKeys("Modified Customer");
			Thread.sleep(2000);
			oPage.getcustomersettings().click();
			System.out.println("Modified Customer");
			System.out.println("*****************");
			Thread.sleep(4000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deletecustomer() 
	{
		try 
		{
			oPage.getcustomersettings().click();
			Thread.sleep(1000);
			oPage.getactions().click();
			Thread.sleep(2000);
			oPage.getDeleteActions().click();
			Thread.sleep(2000);
			oPage.getdeleteconfirm().click();
			System.out.println("Customer Deleted");
			System.out.println("****************");
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
}
