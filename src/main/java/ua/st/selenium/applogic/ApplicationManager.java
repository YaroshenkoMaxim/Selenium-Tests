package ua.st.selenium.applogic;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ru.stqa.selenium.factory.WebDriverPool;
import ua.st.selenium.SuiteConfiguration;

public class ApplicationManager
{
	private UserHelper userHelper;
	
	private WebDriver driver;
	
	public ApplicationManager(WebDriver driver)
	{
		this.driver = driver;
		userHelper = new UserHelper(this);
		
		driver.get("http://price.ua/");
	}
	
	public UserHelper getUserHelper()
	{
		return userHelper;
	}
		
	public WebDriver getWebDriver()
	{
		return driver;
	} 
}