package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLeavesTypesPage;
import POMClasses.ActitimeLoginPage;
import POMClasses.ActitimeNewLeaveTypesPage;
import POMClasses.ActitimeSettingsPage;

public class TC_08_ActitimeCreateLeaveType
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
	
	ActitimeSettingsPage settingspage = new ActitimeSettingsPage(driver);
	settingspage.leaveTypesMethod();
	
	ActitimeLeavesTypesPage leaveTypes = new ActitimeLeavesTypesPage(driver);
	leaveTypes.typeOfLeavesMethod();
	
	ActitimeNewLeaveTypesPage newLeavePage = new ActitimeNewLeaveTypesPage(driver);
	newLeavePage.createTypeOfLeaveMethod();
	}
}
