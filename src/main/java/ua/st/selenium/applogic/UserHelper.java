package ua.st.selenium.applogic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import ua.st.selenium.model.User;
import ua.st.selenium.pages.LoginPage;
import ua.st.selenium.pages.Page;

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
		this.user = user;
		
		pages.loginPage.openLoginPage()
				.setEmailField(user.getEmail())
				.setPasswordField(user.getPassword())
				.clickLoginButton();
	}
	
	public void logout()
	{
		pages.cabinetUser.clickLogoutLink();
	}
	
	public boolean isLoggedIn()
	{
		return !pages.loginPage.getHeaderUserText().equals("¬ход");
	}
	
	public boolean isLoggedInAs(User user)
	{
		return isLoggedIn() && this.user.getLogin().equals(user.getLogin());
	}
	
	public boolean isNotLoggedIn()
	{
		return !isLoggedIn();
	}
	
	public ArrayList getErrorMessages()
	{
		ArrayList l = new ArrayList();
		
		for (WebElement el: pages.loginPage.getErrorMessages())
			l.add(el.getText());
		
		return l;
	}
}
