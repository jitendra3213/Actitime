package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMClasses.ActitimeHomePage;
import POMClasses.ActitimeLoginPage;
import POMClasses.ActitimeNewProjectPage;
import POMClasses.ActitimeTaskPage;

public class TC_04_ActitimeCreateProject
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
		
		ActitimeTaskPage tasklist = new ActitimeTaskPage(driver);
		tasklist.addnewProjectMethod();
		
		ActitimeNewProjectPage newproject = new ActitimeNewProjectPage(driver);
		newproject.createProjectMethod();
		
		homePage.logoutMethod();
		

}
}
