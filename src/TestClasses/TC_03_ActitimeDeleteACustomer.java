package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMClasses.ActitimeCustomer;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLoginPage;
import POMClasses.ActitimeTaskPage;

public class TC_03_ActitimeDeleteACustomer
{
public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage = new ActitimeHomePage(driver);
		homePage.tasksMethod();
		
		ActitimeTaskPage taskpage = new ActitimeTaskPage(driver);
		taskpage.editCustomerMethod();
		
		ActitimeCustomer customerpage = new ActitimeCustomer(driver);
		customerpage.deleteCustomerMethod();
		
		homePage.logoutMethod();
		
	}
}
