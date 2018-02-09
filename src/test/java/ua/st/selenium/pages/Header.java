package ua.st.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends Page
{
	public Header(PageManager pages)
	{
		super(pages);
	}
	
	@FindBy(id = "header-user-link")
	private WebElement headerUserLink;
	
	public String getHeaderUserText()
	{
		return headerUserLink.toString();
	}
	
}
