package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLeavesTypesPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy (id = "ext-comp-1002")
	private WebElement createLeaveTypesButton;
	

	public  ActitimeLeavesTypesPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void typeOfLeavesMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(createLeaveTypesButton));
		js.executeScript("arguments[0].click()",createLeaveTypesButton);
		
		
	}	

}
