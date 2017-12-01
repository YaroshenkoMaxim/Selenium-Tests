package ua.st.selenium.applogic;

import ua.st.selenium.model.User;

public class UserHelper 
{
	private User user;
	
	public void loginAs(User user)
	{
		this.user = user;
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
