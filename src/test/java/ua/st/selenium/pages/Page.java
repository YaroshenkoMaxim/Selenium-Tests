package ua.st.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ua.st.selenium.applogic.PageManager;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page
{
  protected WebDriver driver;
  protected PageManager pages;
  
  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(PageManager pages) {
	this.pages = pages;
    driver = pages.getWebDriver();
  }
    
  public String getTitle() {
    return driver.getTitle();
  }

}
