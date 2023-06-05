package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeListofUsersPage;
import POMClasses.ActitimeLoginPage;

public class TC_05_ActitimeCreateUser 
{
	@Test
	public void createUser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");

		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();

		ActitimeHomePage homepage = new ActitimeHomePage(driver);
		homepage.userMethod();

		ActitimeListofUsersPage UserPage = new ActitimeListofUsersPage(driver);
		UserPage.createUserMethod();

		//homepage.logoutMethod();

	}
}
