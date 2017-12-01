package ua.st.selenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ua.st.selenium.model.User;

public class LoginTest extends TestNgTestBase
{
	@BeforeMethod
	public void mayBeLogout()
	{
		if (app.getUserHelper().isLoggedIn())
			app.getUserHelper().logout();
	}
	
	@Test
	public void testoginOk()
	{
		driver.get(baseUrl);
		
		User user = new User().setEmail("test02081701@yopmail.fr").setPassword("123123123");
		app.getUserHelper().loginAs(user);
		assertTrue(app.getUserHelper().isLoggedInAs(user));
	}
}
