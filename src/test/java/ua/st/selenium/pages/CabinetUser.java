package ua.st.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CabinetUser extends AnyPage
{
	public CabinetUser(PageManager pages)
	{
		super(pages);
		//this.driver = driver;
	}
	
	@FindBy(id = "logout_form_yw2")
	private WebElement logoutLink;
	
	public void clickLogoutLink()
	{
		getHeaderUserLink().click();
		logoutLink.click();
	}
	
	
	
	
}
