package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSettingsPage 
{
WebDriver driver;
WebDriverWait wait;
JavascriptExecutor js;

@FindBy (xpath = "//a[.='Types of Work']")
private WebElement typesOfWorkButton;

@FindBy (xpath = "//a[.='Leave Types']")
private WebElement leaveTypesButton;

public ActitimeSettingsPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void typesOfWorkMethod()
{
	wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	wait.until(ExpectedConditions.visibilityOf(typesOfWorkButton));
	js.executeScript("arguments[0].click()",typesOfWorkButton);
	
}

public void leaveTypesMethod()
{
	wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	wait.until(ExpectedConditions.visibilityOf(leaveTypesButton));
	js.executeScript("arguments[0].click()",leaveTypesButton);
	
}
}
