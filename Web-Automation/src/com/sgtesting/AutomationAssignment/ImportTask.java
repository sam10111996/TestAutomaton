package com.sgtesting.AutomationAssignment;

import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTask {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// Login navigate Import task and delete project delete customer and logout and close 
		//application
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWin();
		ImportTasks();
//		deleteTaskByJS();
		deletetask();
		deletecustomer();
		logout();
	}
	static void launchBrowser() {
		String path=null;
		try {
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+ "\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void navigate() {
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyoutWin() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void ImportTasks() {
		try {
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[text()='Add New Task']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='item importTasks ellipsis']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			
			Robot robot=new Robot();
			String filepath="E:\\ImportTask\\Sample.csv";
			copyFilePath(filepath);
			
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("loadTasksFromCSVPopup_commitBtn")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("closeLoadTasksFromCSVPopupButton")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deletetask() {
		try {
			oBrowser.findElement(By.xpath("//div[text()='Task 1']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.headerBlock>div.header>div.actions>div>div>div.action")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.edit_task_sliding_panel.sliding_panel>div.dropdownContainer.actionsMenu> div > div.deleteButton > div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//div[text()='Task 2']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.headerBlock>div.header>div.actions>div>div>div.action")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.edit_task_sliding_panel.sliding_panel>div.dropdownContainer.actionsMenu> div > div.deleteButton > div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//div[text()='Task 3']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.headerBlock>div.header>div.actions>div>div>div.action")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.edit_task_sliding_panel.sliding_panel>div.dropdownContainer.actionsMenu> div > div.deleteButton > div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//div[text()='Task 4']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.headerBlock>div.header>div.actions>div>div>div.action")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("div.edit_task_sliding_panel.sliding_panel>div.dropdownContainer.actionsMenu> div > div.deleteButton > div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deletecustomer() {
		try {
			oBrowser.findElement(By.cssSelector("div:nth-child(4) > div.editButton.available")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("div.headerBlock > div.actions > div > div > div.action")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("div.edit_customer_sliding_panel.sliding_panel > div.dropdownContainer.actionsMenu > div > div.deleteButton > div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.cssSelector("div.itemsContainer > div.node.customerNode.notSelected > div.editButton.available")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("div.headerBlock > div.actions > div > div > div.action")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("div.edit_customer_sliding_panel.sliding_panel > div.dropdownContainer.actionsMenu > div > div.deleteButton > div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(4000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			oBrowser.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	static void deleteTaskByJS() {
//		try {
//			oBrowser.findElement(By.cssSelector("div.tasksTable.allTasksLoaded>table>tbody>tr>td.selection>div")).click();
//			Thread.sleep(2000);
//			JavascriptExecutor js=null;
//			js=(JavascriptExecutor) oBrowser;
//			js.executeScript("document.getElementByclass('deleteButton').click();");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	static void copyFilePath(String filepath) {
		StringSelection strselection=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	}
}
