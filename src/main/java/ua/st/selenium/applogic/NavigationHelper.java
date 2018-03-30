package ua.st.selenium.applogic;

import ua.st.selenium.pages.HomePage;

public class NavigationHelper extends DriverBasedHelper
{
	private ApplicationManager manager;
	
	public NavigationHelper(ApplicationManager manager)
	{
		super(manager.getWebDriver());
		this.manager = manager;
	}
	
	public HomePage openHomePage()
	{
		driver.get("http://price.ua/");
		
		return pages.homePage;
	}
	
	public HomePage getHomePage()
	{
		return pages.homePage;
	}
}
