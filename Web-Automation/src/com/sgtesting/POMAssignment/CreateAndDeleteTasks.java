package com.sgtesting.POMAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteTasks {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// create task and delete task
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createcustomer();
		createproject();
		createTask();
		deletetask();
		deleteproject();
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
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createproject() 
	{
		try 
		{
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getNewProject().click();
			oPage.getCreateProject().sendKeys("Demo Project");
			Thread.sleep(4000);
			oPage.getCreateProjectButton().click();
			System.out.println("Project Created");
			System.out.println("***************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createTask() 
	{
		try
		{
			oPage.getTaskDropdown().click();
			Thread.sleep(2000);
			oPage.getClickOnCreateTask().click();
			Thread.sleep(2000);
			oPage.getTaskInput().sendKeys("Demo Task");
			Thread.sleep(2000);
			oPage.getAddtaskCmtBtn().click();
			Thread.sleep(4000);
			System.out.println("Task Created");
			System.out.println("************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deletetask() 
	{
		try 
		{
			oPage.getTaskActionBtn().click();
			Thread.sleep(2000);
			oPage.getDeletActionBtn().click();
			Thread.sleep(2000);
			oPage.getDeleteBtn().click();
			Thread.sleep(2000);
			oPage.getConfirmDeleteTaskAction().click();
			Thread.sleep(4000);
			System.out.println("Task Deleted");
			System.out.println("************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteproject() 
	{
		try 
		{
			oPage.getModifyProjecticon().click();
			Thread.sleep(2000);
			oPage.getProjectAction().click();
			oPage.getProjectDelButton().click();
			Thread.sleep(2000);
			oPage.getProjectDeleteConfirm().click();
			System.out.println("Project Deleted");
			System.out.println("***************");
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
			Thread.sleep(2000);
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
