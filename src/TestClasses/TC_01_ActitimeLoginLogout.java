package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLoginPage;

public class TC_01_ActitimeLoginLogout 
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage = new ActitimeHomePage(driver);
		homePage.logoutMethod();
	
	}

}
