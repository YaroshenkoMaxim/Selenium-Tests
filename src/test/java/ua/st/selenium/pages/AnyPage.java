package ua.st.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ua.st.selenium.applogic.PageManager;

public class AnyPage extends Page
{
	public AnyPage(PageManager pages)
	{
		super(pages);
	}
	
	@FindBy(id = "auth-user-block")
	private WebElement headerUserLink;
	
	@FindBy(xpath = "//a[@id='change-region-link']")
	private WebElement headerRegionLink;
	
	public WebElement getHeaderUserLink()
	{
		return headerUserLink;
	}
	
	public String getHeaderUserText()
	{
		return headerUserLink.getText();
	}
	
	public void setRegionInHeader(String region)
	{
		while (true)
		{
			headerRegionLink.click();
		
			try
			{
				WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='list-wrap']/ul/li/a[text()='" + region + "']")));
				element.click();
				break;
			}
			catch (TimeoutException ex)
			{
			}
		}
	}
	
	public String getRegionInHeader()
	{
		return headerRegionLink.getText();
	}
}
