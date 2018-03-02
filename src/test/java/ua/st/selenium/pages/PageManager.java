package ua.st.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager
{
	private WebDriver driver;
	
	public AnyPage anyPage;
	public LoginPage loginPage;
	public CabinetUser cabinetUser;
	
	public PageManager(WebDriver driver)
	{
		this.driver = driver;
		anyPage = initElements(new AnyPage(this));
		loginPage = initElements(new LoginPage(this));
		cabinetUser = initElements(new CabinetUser(this));
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
