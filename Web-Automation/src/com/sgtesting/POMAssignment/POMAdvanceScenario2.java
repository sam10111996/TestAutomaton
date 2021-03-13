package com.sgtesting.POMAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAdvanceScenario2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// Advanced Scenario2
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createusers();
		logout();
		loginAsUser1();
		logout();
		loginAsUser2();
		logout();
		loginAsUser3();
		logout();
		login();
		modifyPasswordforUser1();
		modifyPasswordforUser2();
		modifyPasswordforUser3();
		logout();
		loginAsmodifiedUser1();
		logout();
		loginAsmodifiedUser2();
		logout();
		loginAsmodifiedUser3();
		logout();
		login();
		deleteUser1();
		deleteUser2();
		deleteUser3();
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
	
	static void createusers() 
	{
		for(int i=1; i<=3; i++) 
		{
			try 
			{
				oPage.getusernameButton().click();
				Thread.sleep(2000);
				oPage.getAdduser().click();
				Thread.sleep(2000);
				oPage.getfirstname().sendKeys("user"+i);
				oPage.getlastname().sendKeys("demo");
				oPage.getEmail().sendKeys("userdemo123@gmail.com");
				oPage.getNewUserName().sendKeys("userdemo"+i);
				oPage.getnewuserpassword().sendKeys("welcome");
				oPage.getReEnterpassword().sendKeys("welcome");
				Thread.sleep(2000);
				oPage.getcreatebutton().click();
				System.out.println("User"+i+" Created");
				System.out.println("************");
				Thread.sleep(4000);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	static void loginAsUser1() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo1");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
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
			oPage.getUserName().sendKeys("userdemo2");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsUser3() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo3");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPasswordforUser1() 
	{
		try 
		{
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.getnewuserpassword().sendKeys("welcome1");
			Thread.sleep(2000);
			oPage.getReEnterpassword().sendKeys("welcome1");
			Thread.sleep(2000);
			oPage.getsavechanges().click();
			System.out.println("User1 Modified");
			System.out.println("*************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPasswordforUser2() 
	{
		try 
		{
			oPage.getUser2().click();
			Thread.sleep(2000);
			oPage.getnewuserpassword().sendKeys("welcome2");
			Thread.sleep(2000);
			oPage.getReEnterpassword().sendKeys("welcome2");
			Thread.sleep(2000);
			oPage.getsavechanges().click();
			System.out.println("User2 Modified");
			System.out.println("*************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPasswordforUser3() 
	{
		try 
		{
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getnewuserpassword().sendKeys("welcome3");
			Thread.sleep(2000);
			oPage.getReEnterpassword().sendKeys("welcome3");
			Thread.sleep(2000);
			oPage.getsavechanges().click();
			System.out.println("User3 Modified");
			System.out.println("*************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsmodifiedUser1() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo1");
			oPage.getPassword().sendKeys("welcome1");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
//			oPage.getStartExploring().click();
//			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsmodifiedUser2() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo2");
			oPage.getPassword().sendKeys("welcome2");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
//			oPage.getStartExploring().click();
//			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsmodifiedUser3() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo3");
			oPage.getPassword().sendKeys("welcome3");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
//			oPage.getStartExploring().click();
//			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser1() 
	{
		try 
		{
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User1 Deleted");
			System.out.println("*************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser2() 
	{
		try 
		{
			oPage.getUser2().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User2 Deleted");
			System.out.println("*************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser3() 
	{
		try 
		{
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User3 Deleted");
			System.out.println("*************");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
