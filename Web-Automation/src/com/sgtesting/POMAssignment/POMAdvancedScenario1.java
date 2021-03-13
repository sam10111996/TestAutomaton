package com.sgtesting.POMAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAdvancedScenario1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// Advanced Scenario
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createuser1();
		logout();
		loginAsUser1();
		createuser2();
		modifyUser2();
		logout();
		loginAsUser2();
		createuser3();
		logout();
		login();
		modifyUser1();
		logout();
		loginAsModifiedUser1();
		logout();
		loginUser2();
		deleteUser3();
		logout();
		loginAsModifiedUser1();
		deleteUser2();
		logout();
		login();
		deleteUser1();
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
	
	static void createuser1() {
		try
		{
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("user1");
			oPage.getlastname().sendKeys("demo");
			oPage.getEmail().sendKeys("userdemo123@gmail.com");
			oPage.getNewUserName().sendKeys("userdemo1");
			oPage.getnewuserpassword().sendKeys("welcome");
			oPage.getReEnterpassword().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getcreatebutton().click();
			System.out.println("User1 Created");
			System.out.println("************");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
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
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createuser2() 
	{
		try
		{
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("user2");
			oPage.getlastname().sendKeys("demo");
			oPage.getEmail().sendKeys("userdemo123@gmail.com");
			oPage.getNewUserName().sendKeys("userdemo2");
			oPage.getnewuserpassword().sendKeys("welcome");
			oPage.getReEnterpassword().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getcreatebutton().click();
			System.out.println("User2 Created");
			System.out.println("************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser2() 
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
	
	static void loginAsUser2() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo2");
			oPage.getPassword().sendKeys("welcome2");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void createuser3() 
	{
		try
		{
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("user3");
			oPage.getlastname().sendKeys("demo");
			oPage.getEmail().sendKeys("userdemo123@gmail.com");
			oPage.getNewUserName().sendKeys("userdemo3");
			oPage.getnewuserpassword().sendKeys("welcome");
			oPage.getReEnterpassword().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getcreatebutton().click();
			System.out.println("User3 Created");
			System.out.println("************");
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1() 
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
	static void loginAsModifiedUser1() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo1");
			oPage.getPassword().sendKeys("welcome1");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
//			oPage.getStartExploring().click();
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser2() 
	{
		try 
		{
			oPage.getUserName().sendKeys("userdemo2");
			oPage.getPassword().sendKeys("welcome2");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
//			oPage.getStartExploring().click();
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser3() {
		try {
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User3 Deleted");
			System.out.println("*************");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser2() {
		try {
			oPage.getusernameButton().click();
			Thread.sleep(2000);
			oPage.getUser2().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("User2 Deleted");
			System.out.println("*************");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser1() {
		try {
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
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
