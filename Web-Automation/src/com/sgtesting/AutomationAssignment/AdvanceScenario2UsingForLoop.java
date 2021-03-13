package com.sgtesting.AutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario2UsingForLoop {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		handlepopupwindow();
		createusers();
		logout();
		loginAsUser1();
		logout();
		loginAsUser2();
		logout();
		loginAsUser3();
		logout();
		login();
		ModifyUsers();
		logout();
		loginAsModifiedUser1();
		logout();
		loginAsModifiedUser2();
		logout();
		loginAsModifiedUser3();
		logout();
		login();
		DeleteUsers();
//		logout();
//		close();
	}
	static void launchBrowser()
	{
		String path=null;
		try 
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+ "\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void handlepopupwindow() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void close() 
	{
		try
		{
			oBrowser.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createusers() 
	{
		for(int i=1; i<=3; i++) 
		{
			try {
				oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("User");
				oBrowser.findElement(By.name("lastName")).sendKeys("Test"+i);
				oBrowser.findElement(By.name("email")).sendKeys("UserTest@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("User"+i);
				oBrowser.findElement(By.name("password")).sendKeys("user");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("user");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
				System.out.println("USER"+i+" Created");
				System.out.println("*****************");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	static void loginAsUser1() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("user");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("user");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Test1, User'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Test1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Test1");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			System.out.println("User1 Modified");
			System.out.println("**************");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Test2, User'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Test2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Test2");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			System.out.println("User2 Modified");
			System.out.println("**************");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Test3, User'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Test3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Test3");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			System.out.println("User3 Modified");
			System.out.println("**************");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginAsModifiedUser1() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Test1");
			oBrowser.findElement(By.id("loginButton")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Test2");
			oBrowser.findElement(By.id("loginButton")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Test3");
			oBrowser.findElement(By.id("loginButton")).click();
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
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Test1, User'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User1 Deleted");
			System.out.println("***************************");
			
			oBrowser.findElement(By.xpath("//span[text()='Test2, User'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User2 Deleted");
			System.out.println("***************************");
			
			oBrowser.findElement(By.xpath("//span[text()='Test3, User'][@class='userNameSpan']")).click();
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
}
