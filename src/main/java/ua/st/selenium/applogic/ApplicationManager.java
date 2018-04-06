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
	private NavigationHelper navigationHelper;
	
	private WebDriver driver;
	//protected static URL gridHubUrl = null;
	//protected static String baseUrl;
	//protected static Capabilities capabilities;
	
	/*@BeforeSuite
	  public void initTestSuite() throws IOException {
	    SuiteConfiguration config = new SuiteConfiguration();
	    baseUrl = config.getProperty("site.url");
	    if (config.hasProperty("grid.url") && !"".equals(config.getProperty("grid.url"))) {
	      gridHubUrl = new URL(config.getProperty("grid.url"));
	    }
	    capabilities = config.getCapabilities();
	  }
	
	  @BeforeMethod
	  public void initWebDriver() {
	    driver = WebDriverPool.DEFAULT.getDriver(gridHubUrl, capabilities);
	  }*/
	
	public ApplicationManager(WebDriver driver)
	{
		/*SuiteConfiguration config = new SuiteConfiguration();
	    baseUrl = config.getProperty("site.url");
	    if (config.hasProperty("grid.url") && !"".equals(config.getProperty("grid.url"))) {
	      gridHubUrl = new URL(config.getProperty("grid.url"));
	    }
	    capabilities = config.getCapabilities();
	    
	    driver = WebDriverPool.DEFAULT.getDriver(gridHubUrl, capabilities);*/
		
		System.out.println("NEW APP");
		this.driver = driver;
		
		userHelper = new UserHelper(this);
		navigationHelper = new NavigationHelper(this);
		
		//getNavigationHelper().openHomePage();
	}
	
	/*@AfterSuite(alwaysRun = true)
	  public void tearDown() {
	    WebDriverPool.DEFAULT.dismissAll();
	  }*/
	
	public UserHelper getUserHelper()
	{
		return userHelper;
	}
	
	public NavigationHelper getNavigationHelper()
	{
		return navigationHelper;
	}
		
	public WebDriver getWebDriver()
	{
		return driver;
	} 
}