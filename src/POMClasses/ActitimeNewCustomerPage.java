package POMClasses;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeNewCustomerPage {

	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;

	//Declaration

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTextfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath = "//div[.='Customer with the specified name already exists']")
	private WebElement errorMessage;

	//Initialistaion

	public ActitimeNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Utilisation 

	public void createCustomerMethod(String customerName) throws InterruptedException 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(enterCustomerNameTextfield));
		//js.executeScript("arguments[0].value='Ipsita Panda'", enterCustomerNameTextfield);
		enterCustomerNameTextfield.sendKeys(customerName);
		
		wait.until(ExpectedConditions.titleContains("Task List"));
		js.executeScript("arguments[0].click()", createCustomerButton);
		Thread.sleep(5000);
		
//		try 
//		{
//			wait.until(ExpectedConditions.visibilityOf(enterCustomerNameTextfield));
//		}
//		catch (Exception e) 
//		{
//			wait.until(ExpectedConditions.visibilityOf(enterCustomerNameTextfield));
		//js.executeScript("arguments[0].value='Ipsita Panda'", enterCustomerNameTextfield);
//			enterCustomerNameTextfield.sendKeys(customerName);
//		}
	}
	
	public void errorMessage()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		String errormsgTxt = errorMessage.getText();
		System.out.println(errormsgTxt);
		String actualResult = errormsgTxt;
		String expectedResult = "duplicate names";
		assertEquals(actualResult, expectedResult,"Duplicate verification failed");
	}
}