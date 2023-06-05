package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLoginPage;
import POMClasses.ActitimeNewCustomerPage;
import POMClasses.ActitimeTaskPage;

public class TC_02_ActitimeCreateACustomer 
{
public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();

		ActitimeHomePage homePage = new ActitimeHomePage(driver);
		homePage.tasksMethod();
		
		ActitimeTaskPage tasklist = new ActitimeTaskPage(driver);
		tasklist.addnewCustomerMethod();
		
		ActitimeNewCustomerPage newCustomerPage = new ActitimeNewCustomerPage(driver);
		newCustomerPage.createCustomerMethod("customerName");
		
		homePage.logoutMethod();

	}	

}
