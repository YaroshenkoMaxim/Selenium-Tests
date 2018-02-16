package ua.st.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnyPage extends Page
{
	public AnyPage(PageManager pages)
	{
		super(pages);
	}
	
	@FindBy(id = "auth-user-block")
	private WebElement headerUserLink;
	
	public WebElement getHeaderUserLink()
	{
		return headerUserLink;
	}
	
	public String getHeaderUserText()
	{
		return headerUserLink.getText();
	}
}
