package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCustomer 
{
	WebDriver driver;
	WebDriverWait wait;
		
	@FindBy (xpath = "//div[@title='Ipsita Panda']/..//div[@class='editButton']")
	private WebElement customerEditbutton;
	
	@FindBy (xpath = "//div[@class='editCustomerPanelHeader']//div[@class='actionButton']//div[.='ACTIONS']")
	private WebElement customerActionsButton;
	
	@FindBy (xpath = "//div[@class='edit_customer_sliding_panel sliding_panel components_panelContainer']//div[@class=\"dropdownContainer actionsMenu\"]//div[.='Delete']")
	private WebElement customerDeleteButton;
	
	@FindBy (xpath = "//span[.='Delete permanently']")
	private WebElement deleteConfirmationButton;

	public ActitimeCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteCustomerMethod() 
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
			
		wait.until(ExpectedConditions.visibilityOf(customerEditbutton));
		js.executeScript("arguments[0].click()",customerEditbutton);
		
		wait.until(ExpectedConditions.visibilityOf(customerActionsButton));
		js.executeScript("arguments[0].click()", customerActionsButton);
		
		wait.until(ExpectedConditions.visibilityOf(customerDeleteButton));
		js.executeScript("arguments[0].click()",customerDeleteButton );
		
		js.executeScript("arguments[0].scrollIntoView(true)", deleteConfirmationButton);
		wait.until(ExpectedConditions.visibilityOf(deleteConfirmationButton));
		js.executeScript("arguments[0].click()", deleteConfirmationButton);
	}
}
