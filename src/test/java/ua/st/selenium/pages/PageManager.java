package ua.st.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager
{
	private WebDriver driver;
	
	public LoginPage loginPage;
	public Header header;
	
	public PageManager(WebDriver driver)
	{
		this.driver = driver;
		loginPage = initElements(new LoginPage(this));
		header = initElements(new Header(this)); 
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
