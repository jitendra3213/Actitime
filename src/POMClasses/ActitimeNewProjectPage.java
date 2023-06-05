package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeNewProjectPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	//Declaration

	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectNameTextfield;

	@FindBy(xpath = "//div[contains(text(),'-- Please Select Customer to Add Project for  --')]")
	private WebElement selectCustomerDropdownlist;

	@FindBy(xpath = "//div[.='Create Project']")
	private WebElement createProjectButton;

	@FindBy(xpath = "//div[@class='searchItemList']//div[.='Big Bang Company']")
	private WebElement client;

	//Initialistaion

	public ActitimeNewProjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Utilisation 

	public void createProjectMethod()  
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(enterProjectNameTextfield));
		js.executeScript("arguments[0].value='TestNG'", enterProjectNameTextfield);
		
		wait.until(ExpectedConditions.visibilityOf(selectCustomerDropdownlist));
		js.executeScript("arguments[0].click()", selectCustomerDropdownlist);
//		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", client);
		
		wait.until(ExpectedConditions.visibilityOf(createProjectButton));
		js.executeScript("arguments[0].click()", createProjectButton);
	}

}
