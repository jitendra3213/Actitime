package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeListofUsersPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy (xpath="//div[.='New User']")
	private WebElement newuserButton;

	@FindBy (id = "usersManagementBodyTagId")
	private WebElement firstnameTextfield;

	@FindBy (id = "createUserPanel_lastNameField")
	private WebElement lastnameTextfield;

	@FindBy (id = "createUserPanel_emailField")
	private WebElement emailTextfield;
	@FindBy (xpath = "//div[.='Save & Send Invitation']")
	private WebElement saveUserButton;
	public ActitimeListofUsersPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void createUserMethod() throws InterruptedException 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.visibilityOf(newuserButton));
		js.executeScript("arguments[0].click()", newuserButton);
		
		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOf(firstnameTextfield));
		firstnameTextfield.sendKeys("Ipsita"); //Not working

//		wait.until(ExpectedConditions.visibilityOf(lastnameTextfield));
//		js.executeScript("arguments[0].value='Panda'",lastnameTextfield ); //Not working
//
//		wait.until(ExpectedConditions.visibilityOf(emailTextfield));
//		js.executeScript("arguments[0].value='ip@qspiders.com'", emailTextfield);
//
//		wait.until(ExpectedConditions.visibilityOf(saveUserButton));
//		js.executeScript("arguments[0].click()",saveUserButton );
	}
}
