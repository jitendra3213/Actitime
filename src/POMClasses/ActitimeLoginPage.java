package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginPage
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	//Declaration

	@FindBy(id = "username")
	private WebElement usernameTextField;

	@FindBy(name = "pwd")
	private WebElement passwordTextField;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInChechbox;

	@FindBy(xpath =  "//div[.='Login ']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;

	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actiTIMEIncLink;


	//Initialistaion

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Utilisation 

	public void loginMethod() 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.titleContains("Login"));
		js.executeScript("arguments[0].value='admin'",usernameTextField);

		wait.until(ExpectedConditions.titleContains("Login"));
		js.executeScript("arguments[0].value='manager'", passwordTextField);

		wait.until(ExpectedConditions.titleContains("Login"));
		js.executeScript("arguments[0].click()", loginButton);

	}

	public void forgotPasswordMethod() 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.titleContains("Login"));
		js.executeScript("arguments[0].click()",forgotYourPasswordLink);
	}

	public void actiTIMEIncMethod() 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.titleContains("Login"));
		js.executeScript("arguments[0].click()",actiTIMEIncLink);
	}
}