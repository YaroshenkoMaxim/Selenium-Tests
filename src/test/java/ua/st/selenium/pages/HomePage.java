package ua.st.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ua.st.selenium.TestNgTestBase;
import ua.st.selenium.applogic.PageManager;

/**
 * Sample page
 */
public class HomePage extends AnyPage
{
  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;
  private String url = "/";

  public HomePage(PageManager pages)
  {
    super(pages);
  }
}
