package ua.st.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page
{
	//WebDriver driver;	
	
	public LoginPage(PageManager pages)
	{
		super(pages);
		//this.driver = driver;
	}
	
	public LoginPage openLoginPage()
	{
		driver.get("http://price.ua/user/login");
		return this;
	}
	
	@FindBy(id = "LoginForm_username")
	private WebElement emailField;
	
	@FindBy(id = "LoginForm_password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//a[contains(@class,'fbold')]")
	private WebElement loginButton;	
	
	public LoginPage setEmailField(String text)
	{
		emailField.sendKeys(text);
		return this;
	}
	
	public LoginPage setPasswordField(String text)
	{
		passwordField.sendKeys(text);
		return this;
	}
	
	public LoginPage clickLoginButton()
	{
		loginButton.click();
		return this;
	}
	
	/*public WebElement getEmailField()
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
	}*/
}
