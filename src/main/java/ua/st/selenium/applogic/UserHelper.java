package ua.st.selenium.applogic;

import ua.st.selenium.model.User;
import ua.st.selenium.pages.LoginPage;

public class UserHelper 
{
	private User user;
	private ApplicationManager manager;
	
	public UserHelper(ApplicationManager manager)
	{
		this.manager = manager;
	}
	
	public void loginAs(User user)
	{
		LoginPage loginPage = new LoginPage(manager.getWebDriver());
		loginPage.openLoginPage();
		loginPage.getEmailField().sendKeys(user.getEmail());
		loginPage.getPasswordField().sendKeys(user.getPassword());
		loginPage.getLoginButton().click();
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
