package ua.st.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage //extends Page
{
	WebDriver driver;	
	
	public LoginPage(WebDriver driver)
	{
		//super(driver);
		this.driver = driver;
	}
	
	public void openLoginPage()
	{
		driver.get("http://price.ua/user/login");
	}
	
	public WebElement getEmailField()
	{
		return driver.findElement(By.id("LoginForm_username"));
	}
	
	public WebElement getPasswordField()
	{
		return driver.findElement(By.id("LoginForm_password"));
	}
	
	public WebElement getLoginButton()
	{
		return driver.findElement(By.xpath("//a[contains(@class,'fbold')]"));
	}
}
