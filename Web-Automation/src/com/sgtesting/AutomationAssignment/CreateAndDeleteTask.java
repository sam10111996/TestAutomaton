package com.sgtesting.AutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteTask {
	public static WebDriver oBrowser=null; 
	public static void main(String[] args) {
		// login into acttime and create task to project and delete
		launchbrowser();
		navigate();
		login();
		createcustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
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
	static void createcustomer() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("CustomerDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Testing");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createTask() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("Testing Task");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("ext-gen144")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("ext-gen307")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("ext-gen154")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("ext-gen342")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			System.out.println("Task Created Successfully");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteTask() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			System.out.println("Task Deleted");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
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
