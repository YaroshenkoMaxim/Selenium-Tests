package ua.st.selenium;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ua.st.selenium.model.User;

public class LoginTest extends TestNgTestBase
{
	@BeforeMethod
	public void mayBeLogout()
	{
		if (driver.getCurrentUrl().equals("about:blank"))
			app.getNavigationHelper().openHomePage();
		else if (app.getUserHelper().isLoggedIn())
			app.getUserHelper().logout();
	}
	
	@Test
	public void testLoginUserOk()
	{
		User user = new User().setLogin("test02081701").setEmail("test02081701@yopmail.fr").setPassword("123123123");
		app.getUserHelper().loginAs(user);
		
		assertTrue(app.getUserHelper().isLoggedInAs(user));
	}
	
	@Test
	public void testLoginFirmOk()
	{
		User user = new User().setLogin("test29021601").setEmail("test29021601@yopmail.fr").setPassword("123123123");
		app.getUserHelper().loginAs(user);
		
		assertTrue(app.getUserHelper().isLoggedInAs(user));
	}
	
	@Test
	public void testLoginUserNotOkInvalidEmail()
	{
		User user = new User().setEmail("test02081701yopmail.fr").setPassword("123123123");
		app.getUserHelper().loginAs(user);
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		assertFalse(app.getUserHelper().isLoggedInAs(user));
		assertTrue(app.getUserHelper().getErrorMessages().get(0).equals("Неверное имя пользователя или пароль."));
	}
	
	@Test
	public void testLoginUserNotOkEmptyEmailAndPassword()
	{
		User user = new User().setEmail("").setPassword("");
		app.getUserHelper().loginAs(user);
		
		assertFalse(app.getUserHelper().isLoggedInAs(user));
		assertTrue(app.getUserHelper().getErrorMessages().get(0).equals("Необходимо заполнить поле «Адрес электронной почты»."));
		assertTrue(app.getUserHelper().getErrorMessages().get(1).equals("Необходимо заполнить поле «Пароль»."));
	}
}
