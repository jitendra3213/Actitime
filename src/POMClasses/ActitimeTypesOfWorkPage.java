package POMClasses;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTypesOfWorkPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy (xpath = "//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	
	@FindBy (xpath = "//a[.='Ipsita']/../..//a[contains(text(),'delete')]")
	private WebElement CreatedWorkDeleteButton;

	public  ActitimeTypesOfWorkPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void typesOfWorkMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(createTypeOfWorkButton));
		js.executeScript("arguments[0].click()",createTypeOfWorkButton);	
	}
	
	public void deleteCreatedWorkMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(CreatedWorkDeleteButton));
		js.executeScript("arguments[0].click()",CreatedWorkDeleteButton);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}

}
