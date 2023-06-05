package POMClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHomePage 
{
	

		public WebDriver driver;
		public WebDriverWait wait;

		//Declaration

		@FindBy(xpath = "//div[.='Tasks']")
		private WebElement tasksButton;
		
		@FindBy(xpath = "//a[.='Logout']")
		private WebElement logoutButton;
		
		@FindBy(id= "container_users")
		private WebElement userButton;
		
		@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
		private WebElement settingsButton;


		//Initialistaion

		public ActitimeHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


		//Utilisation 

		public void tasksMethod() 
		{
			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			wait.until(ExpectedConditions.titleContains("Time-Track"));
			js.executeScript("arguments[0].click()", tasksButton);
		}
		
		public void logoutMethod() 
		{
			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			wait.until(ExpectedConditions.visibilityOf(logoutButton));
			js.executeScript("arguments[0].click()", logoutButton);
		}
		
		public void userMethod() 
		{
			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			wait.until(ExpectedConditions.visibilityOf(userButton));
			js.executeScript("arguments[0].click()", userButton);
		}
		
		public void settingsMethod() 
		{
			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			wait.until(ExpectedConditions.visibilityOf(settingsButton));
			js.executeScript("arguments[0].click()", settingsButton);
		}
	}


