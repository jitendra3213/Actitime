package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMClasses.ActitimeCreateNewTypeOfWorkPage;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLoginPage;
import POMClasses.ActitimeSettingsPage;
import POMClasses.ActitimeTypesOfWorkPage;

public class TC_06_ActitimeCreateTypeOfWork
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
	typesofWork.typesOfWorkMethod();
	
	ActitimeCreateNewTypeOfWorkPage newTypeOfWork = new ActitimeCreateNewTypeOfWorkPage(driver);
	newTypeOfWork.createTypeOfWorkMethod();
	
	
	}
	
}
