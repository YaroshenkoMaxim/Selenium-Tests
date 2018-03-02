package ua.st.selenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ua.st.selenium.model.User;

public class LoginTest extends TestNgTestBase
{
	/*@BeforeMethod
	public void mayBeLogout()
	{
		if (app.getUserHelper().isLoggedIn())
			app.getUserHelper().logout();
	}*/
	
	@Test
	public void testoginOk()
	{
		//driver.get(baseUrl + "/user/login");
		
		User user = new User().setLogin("test02081701").setEmail("test02081701@yopmail.fr").setPassword("123123123");
		app.getUserHelper().loginAs(user);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(app.getUserHelper().isLoggedInAs(user));
		app.getUserHelper().logout();
	}
	
	@Test
	public void testoginNotOkInvalidEmail()
	{
		//driver.get(baseUrl + "/user/login");
		
		User user = new User().setEmail("test02081701yopmail.fr").setPassword("123123123");
		//app.getUserHelper().loginAs(user);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertTrue(app.getUserHelper().isLoggedInAs(user));
	}
}
