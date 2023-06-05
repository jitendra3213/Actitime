package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLoginPage;
import POMClasses.ActitimeSettingsPage;
import POMClasses.ActitimeTypesOfWorkPage;

public class TC_07_ActitimeDeleteTypeOfWork 
{
public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");

	ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
	loginPage.loginMethod();
	
	ActitimeHomePage homepage = new ActitimeHomePage(driver);
	homepage.settingsMethod();
	
	ActitimeSettingsPage settingsPage = new ActitimeSettingsPage(driver);
	settingsPage.typesOfWorkMethod();
	
	ActitimeTypesOfWorkPage typesofWork = new ActitimeTypesOfWorkPage(driver);
	typesofWork.deleteCreatedWorkMethod();
	
	homepage.logoutMethod();
	}
}
