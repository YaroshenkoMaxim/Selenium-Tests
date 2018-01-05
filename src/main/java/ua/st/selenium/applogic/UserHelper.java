package ua.st.selenium.applogic;

import ua.st.selenium.model.User;
import ua.st.selenium.pages.LoginPage;
import ua.st.selenium.pages.Page;
import ua.st.selenium.pages.PageManager;

public class UserHelper extends DriverBasedHelper
{
	private User user;
	private ApplicationManager manager;
	
	public UserHelper(ApplicationManager manager)
	{
		super(manager.getWebDriver());
		this.manager = manager;
	}
	
	public void loginAs(User user)
	{
		pages.loginPage.openLoginPage()
				.setEmailField(user.getEmail())
				.setPasswordField(user.getPassword())
				.clickLoginButton();
	}
	
	public void logout()
	{
		this.user = null;
	}
	
	public boolean isLoggedIn()
	{
		return user != null;
	}
	
	public boolean isLoggedInAs(User user)
	{
		return isLoggedIn() && this.user.getEmail().equals(user.getEmail());
	}
	
	public boolean isNotLoggedIn()
	{
		return user != null;
	}
}
