package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeNewLeaveTypesPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy (id = "leaveTypeLightBox_nameField")
	private WebElement typeofLeaveTextfield;
	
	@FindBy (id = "leaveTypeLightBox_commitBtn")
	private WebElement createTypeOfLeaveButton;

	public  ActitimeNewLeaveTypesPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createTypeOfLeaveMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(typeofLeaveTextfield));
		js.executeScript("arguments[0].value='Emergency'",typeofLeaveTextfield);
		
		wait.until(ExpectedConditions.visibilityOf(createTypeOfLeaveButton));
		js.executeScript("arguments[0].click()",createTypeOfLeaveButton);
		
		
	}
}
