package com.sgtesting.POMAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser) 
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//username
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password 
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	
	//flyout Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	
	//create user button
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement createuserbutton;
	public WebElement getusernameButton() 
	{
		return createuserbutton;
	}
	
	//Add User button
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement Adduserbutton;
	public WebElement getAdduser() 
	{
		return Adduserbutton;
	}
	
	//Name field
	private WebElement firstName;
	public WebElement getfirstname() 
	{
		return firstName ;
	}
	
	//last Name field
	private WebElement lastName;
	public WebElement getlastname() 
	{
		return lastName ;
	}
	
	//email field 
	private WebElement email;
	public WebElement getEmail() 
	{
		return email;
	}
	
	//username field 
	private WebElement userDataLightBox_usernameField;
	public WebElement getNewUserName() 
	{
		return userDataLightBox_usernameField;
	}
	
	//password field for new user 
	private WebElement password;
	public WebElement getnewuserpassword() 
	{
		return password;
	}
	
	//retype password for new user
	private WebElement passwordCopy;
	public WebElement getReEnterpassword()
	{
		return passwordCopy;
	}
	
	//adduser button
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oCreateUser;
	public WebElement getcreatebutton() 
	{
		return oCreateUser;
	}
	
	//click upon user
	@FindBy(xpath="//span[text()='demo, user']")
	private WebElement oFinduser;
	public WebElement getuser() 
	{
		return oFinduser;
	}
	
	//delete button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeletebutton() 
	{
		return userDataLightBox_deleteBtn;
	}
	
	//save changes button for modification
	private WebElement userDataLightBox_commitBtn;
	public WebElement getsavechanges() 
	{
		return userDataLightBox_commitBtn;
	}
	
	//TASKS button
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement oTasks;
	public WebElement getTaskbutton() {
		return oTasks;
	}
	
	//Add new customer/project dropdown
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement Addnew;
	public WebElement getAddnew()
	{
		return Addnew;
	}
	
	//select customer in dropdown
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement customer;
	public WebElement getnewcustomer() 
	{
		return customer;
	}
	
	//Enter customername
	private WebElement customerLightBox_nameField;
	public WebElement getnameofcustomer() 
	{
		return customerLightBox_nameField;
	}
	
	// create customer button
	private WebElement customerLightBox_commitBtn;
	public WebElement getcreatecustomer()
	{
		return customerLightBox_commitBtn;
	}
	
	//customer modification icon
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement customermodification;
	public WebElement getcustomersettings() 
	{
		return customermodification;
	}
	
	//customer action
	@FindBy(xpath="//*[@class='action']")
	private WebElement oAction;
	public WebElement getactions() 
	{
		return oAction;
	}
	
	//customer/project delete button
	@FindBy(xpath="//div[@class='deleteButton'][@style='display: inline-block;']")
	private WebElement oDelete;
	public WebElement getDeleteActions()
	{
		return oDelete;
	}
	
	//customer deleteconfirmbutton
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeleteconfirm() 
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//customer description field
	@FindBy(xpath="//*[@class='textarea'][@placeholder='Enter customer description...']")
	private WebElement oDescription;
	public WebElement getCustomerDescription() 
	{
		return oDescription;
	}
	
	//select project in dropdown
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement project;
	public WebElement getNewProject() 
	{
		return project;
	}
	
	//Enter Project Name
	private WebElement projectPopup_projectNameField;
	public WebElement getCreateProject() 
	{
		return projectPopup_projectNameField;
	}
	
	//create Project button
	private WebElement projectPopup_commitBtn;
	public WebElement getCreateProjectButton() {
		return projectPopup_commitBtn;
	}
	
	//project modification icon
	@FindBy(css="div.node.projectNode.selected > div.editButton.available")
	private WebElement oModifyProject;
	public WebElement getModifyProjecticon() 
	{
		return oModifyProject;
	}
	
	//project action button
	@FindBy(css="div.editProjectPanelHeader > div.actions")
	private WebElement oProjactionbtn;
	public WebElement getProjectAction()
	{
		return oProjactionbtn;
	}
	
	//project deletebutton
	@FindBy(xpath="//div[@class='deleteButton'][@style='display: inline-block;']")
	private WebElement oProjectDeletebtn;
	public WebElement getProjectDelButton()
	{
		return oProjectDeletebtn;
	}
	
	//project Delete Confirm
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getProjectDeleteConfirm()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//modify project 
	@FindBy(css="div.description.section > div.descriptionArea > div > div.descriptionInput > textarea")
	private WebElement oModifyProj;
	public WebElement getProjectDescription()
	{
		return oModifyProj;
	}
	
	//Add Tasks dropdown
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement oTask;
	public WebElement getTaskDropdown() 
	{
		return oTask;
	}
	
	//create new task button
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement ocreatenewtask;
	public WebElement getClickOnCreateTask()
	{
		return ocreatenewtask;
	}
	
	//Enter New Task
	@FindBy(css="#createTasksPopup_createTasksTableContainer > table > tbody > tr:nth-child(1) > td.nameCell.first > input")
	private WebElement oInputTask;
	public  WebElement getTaskInput()
	{
		return oInputTask;
	}
	
	//save task button 
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement oAddTask;
	public WebElement getAddtaskCmtBtn() 
	{
		return oAddTask;
	}
	
	//task modify selector
	@FindBy(css="div.node.projectNode.notSelected > div.editButton.available")
	private WebElement oTaskModify;
	public WebElement getModifyTaskBtn() 
	{
		return oTaskModify;
	}
	
	//task action 
	@FindBy(xpath="//div[@class='title ellipsis'][text()='Demo Task']")
	private WebElement oTaskAction;
	public WebElement getTaskActionBtn() 
	{
		return oTaskAction;
	}
	
	//task delete action
	@FindBy(css=" div.header > div.actions > div > div > div.action")
	private WebElement oDeleteAction;
	public WebElement getDeletActionBtn() 
	{
		return oDeleteAction;
	}
	
	//task delete button
	@FindBy(css="#taskListBlock > div.edit_task_sliding_panel.sliding_panel > div.dropdownContainer.actionsMenu > div > div.deleteButton")
	private WebElement oClickonDelete;
	public WebElement getDeleteBtn() 
	{
		return oClickonDelete;
	}
	
	//task delete confirm button
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getConfirmDeleteTaskAction() 
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	//Start Exploring ActiTime button
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement oWelcome;
	public WebElement getStartExploring() 
	{
		return oWelcome;
	}
	
	//click on user2 to modify
	@FindBy(xpath="//span[@class='userNameSpan'][text()='demo, user2']")
	private WebElement oclickonuser2;
	public WebElement getUser2() 
	{
		return oclickonuser2;
	}
	
	//click on user1 to modify
	@FindBy(xpath="//*[@class='userNameSpan'][text()='demo, user1']")
	private WebElement oclickonuser1;
	public WebElement getUser1() 
	{
		return oclickonuser1;
	}
	
	//click on user3 to modify
	@FindBy(xpath="//*[text()='demo, user3']")
	private WebElement oclickonuser3;
	public WebElement getUser3() 
	{
		return oclickonuser3;
	}
}
