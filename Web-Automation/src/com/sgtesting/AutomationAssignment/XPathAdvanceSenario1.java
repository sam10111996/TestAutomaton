package com.sgtesting.AutomationAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAdvanceSenario1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// Advance Scenario 1
		LaunchBrowser();
		navigate();
		login();
		createuser1();
		Logout();
		loginAsUser1();
		createuser2();
		modifyuser2ForPwd();
		Logout();
		loginAsUser2();
		createuser3();
		Logout();
		login();
		modifyuser1ForPwd();
		Logout();
		loginAsUser1WithNewPwd();
		Logout();
		loginAsNewUser2();
		deleteuser3();
		Logout();
		loginAsUser1WithNewPwd();
		deleteuser2();
		Logout();
		login();
		deleteuser1();
		Logout();
		closeApplication();
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
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void createuser1() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("test");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			oBrowser.findElement(By.name("email")).sendKeys("testuser@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("testuser1");
			oBrowser.findElement(By.name("password")).sendKeys("user1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
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

	static void loginAsUser1() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("testuser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user1");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			//handle screen
			oBrowser.findElement(By.xpath("//div[@class='startExploringLink']")).click();
			Thread.sleep(2000);

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void createuser2() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("test");
			oBrowser.findElement(By.name("lastName")).sendKeys("user2");
			oBrowser.findElement(By.name("email")).sendKeys("testuser2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("testuser2");
			oBrowser.findElement(By.name("password")).sendKeys("user2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void modifyuser2ForPwd() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[text()='user2, test'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("testuser2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("testuser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void loginAsUser2() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("testuser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("testuser2");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			//handle screen
			oBrowser.findElement(By.xpath("//div[@class='startExploringLink']")).click();
			Thread.sleep(2000);

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void createuser3() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("test");
			oBrowser.findElement(By.name("lastName")).sendKeys("user3");
			oBrowser.findElement(By.name("email")).sendKeys("testuser3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("testuser3");
			oBrowser.findElement(By.name("password")).sendKeys("user3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void modifyuser1ForPwd() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='user1, test'][@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("testuser1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("testuser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void loginAsUser1WithNewPwd() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("testuser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("testuser1");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			//					handle screen
			//					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			//					Thread.sleep(2000);

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void loginAsNewUser2() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("testuser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("testuser2");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void deleteuser3() {
		{
			try 
			{
				oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
				oBrowser.findElement(By.xpath("//*[text()='user3, test'][@class='userNameSpan']")).click();
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
	}

	static void deleteuser2() {
		{
			try 
			{
				oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
				oBrowser.findElement(By.xpath("//*[text()='user2, test'][@class='userNameSpan']")).click();
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
	}

	static void deleteuser1() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='user1, test'][@class='userNameSpan']")).click();
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
	static void closeApplication() {
		try {
			oBrowser.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

