package ua.st.selenium;

import org.testng.annotations.Test;

public class LoginTest extends TestNgTestBase
{
	@Test
	public void testOpenHome()
	{
		driver.get(baseUrl);
	}
}
