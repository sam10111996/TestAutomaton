package com.sgtesting.AutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Scenario2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// Advance Scenario 2
		LaunchBrowser();
		navigate();
		login();
		createusers();
		Logout();
		loginAsUser1();
		Logout();
		loginAsUser2();
		Logout();
		loginAsUser3();
		Logout();
		login();
		ModifyUsers();
		Logout();
		loginAsModifiedUser1();
		Logout();
		loginAsModifiedUser2();
		Logout();
		loginAsModifiedUser3();
		Logout();
		login();
		DeleteUsers();
		LogoutAndClose();
	}
	static void LaunchBrowser() {
		String path=null;
		try {
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			}catch(Exception e) {
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
			Thread.sleep(4000);
			//Handle popup window
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void Logout() 
	{
		try 
		{
			oBrowser.findElement(By.linkText("Logout")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createusers() {
		try {
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Test");
			oBrowser.findElement(By.name("email")).sendKeys("User1Test@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1Test");
			oBrowser.findElement(By.name("password")).sendKeys("user1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User1 Created");
			
			oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Test");
			oBrowser.findElement(By.name("email")).sendKeys("User2Test@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2Test");
			oBrowser.findElement(By.name("password")).sendKeys("user2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User2 Created");
			
			oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Test");
			oBrowser.findElement(By.name("email")).sendKeys("User3Test@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3Test");
			oBrowser.findElement(By.name("password")).sendKeys("user3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User3 Created");
			System.out.println("***********************************************");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginAsUser1() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1Test");
			oBrowser.findElement(By.name("pwd")).sendKeys("user1");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as User1 Success");
			System.out.println("**************************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsUser2() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User2Test");
			oBrowser.findElement(By.name("pwd")).sendKeys("user2");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as User2 Success");
			System.out.println("**************************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsUser3() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User3Test");
			oBrowser.findElement(By.name("pwd")).sendKeys("user3");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as User3 Success");
			System.out.println("**************************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void ModifyUsers() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Test1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Test1");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			System.out.println("User1 Modified");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Test2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Test2");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			System.out.println("User2 Modified");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Test3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Test3");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			System.out.println("User3 Modified");
			System.out.println("**************************");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginAsModifiedUser1() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1Test");
			oBrowser.findElement(By.name("pwd")).sendKeys("Test1");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as Modified User1 Success");
			System.out.println("**************************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsModifiedUser2() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User2Test");
			oBrowser.findElement(By.name("pwd")).sendKeys("Test2");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as Modified User2 Success");
			System.out.println("**************************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsModifiedUser3() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User3Test");
			oBrowser.findElement(By.name("pwd")).sendKeys("Test3");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as Modified User3 Success");
			System.out.println("**************************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteUsers() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User1 Deleted");
			System.out.println("***************************");
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User2 Deleted");
			System.out.println("***************************");
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User3 Deleted");
			System.out.println("***************************");
		}catch(Exception e) {
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
