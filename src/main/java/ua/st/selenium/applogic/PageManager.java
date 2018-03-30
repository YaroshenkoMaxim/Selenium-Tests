package ua.st.selenium.applogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ua.st.selenium.pages.AnyPage;
import ua.st.selenium.pages.CabinetUser;
import ua.st.selenium.pages.HomePage;
import ua.st.selenium.pages.LoginPage;
import ua.st.selenium.pages.Page;

public class PageManager
{
	private WebDriver driver;
	
	public AnyPage anyPage;
	public LoginPage loginPage;
	public CabinetUser cabinetUser;
	public HomePage homePage;
	
	public PageManager(WebDriver driver)
	{
		this.driver = driver;
		anyPage = initElements(new AnyPage(this));
		loginPage = initElements(new LoginPage(this));
		cabinetUser = initElements(new CabinetUser(this));
		homePage = initElements(new HomePage(this));
	}
	
	private <T extends Page> T initElements(T page)
	{
		PageFactory.initElements(driver, page);
		return page;
	}
	
	public WebDriver getWebDriver()
	{
		return driver;
	}
}
