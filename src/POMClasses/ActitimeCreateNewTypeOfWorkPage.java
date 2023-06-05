package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCreateNewTypeOfWorkPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy (xpath = "//input[@name='name']")
	private WebElement nameTextfield;
	
	@FindBy (xpath = "//input[@value='   Create Type of Work   ']")
	private WebElement createTypeOfWorkButton;

	public  ActitimeCreateNewTypeOfWorkPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createTypeOfWorkMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(nameTextfield));
		js.executeScript("arguments[0].value='Ipsita'",nameTextfield);
		
		wait.until(ExpectedConditions.visibilityOf(createTypeOfWorkButton));
		js.executeScript("arguments[0].click()",createTypeOfWorkButton);
		
		
	}
}
