package ua.st.selenium.applogic;

import org.openqa.selenium.WebDriver;

import ua.st.selenium.pages.Page;
import ua.st.selenium.pages.PageManager;

public class DriverBasedHelper
{
	protected WebDriver driver;
	protected PageManager pages;
	
	public DriverBasedHelper(WebDriver driver)
	{
		this.driver = driver;
		pages = new PageManager(driver);
	}
}
