package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTaskPage 
{

	public WebDriver driver;
	public WebDriverWait wait;

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewButton;

	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomerButton;

	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement newProjectButton;


	@FindBy (xpath = "//div[@class='itemsContainer']//div[.='Ipsita Panda']")
	private WebElement customerButton;

	public ActitimeTaskPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void addnewCustomerMethod() throws InterruptedException 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.titleContains("Task List"));
		js.executeScript("arguments[0].click()", addnewButton);

		wait.until(ExpectedConditions.titleContains("Task List"));
		js.executeScript("arguments[0].click()", newCustomerButton);
		
		Thread.sleep(5000);
		
	}

	public void addnewProjectMethod() 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.titleContains("Task List"));
		js.executeScript("arguments[0].click()", addnewButton);

		wait.until(ExpectedConditions.visibilityOf(newProjectButton));
		js.executeScript("arguments[0].click()", newProjectButton);
	}

	public void editCustomerMethod() 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView(true)", customerButton);
		wait.until(ExpectedConditions.visibilityOf(customerButton));
		js.executeScript("arguments[0].click()", customerButton);
	}
}