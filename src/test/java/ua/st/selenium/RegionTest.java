package ua.st.selenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class RegionTest extends TestNgTestBase
{
	@Test
	public void changeRegionInHeaderOnMain()
	{
		app.getNavigationHelper().openHomePage().setRegionInHeader("Севастополь");
		assertTrue(app.getNavigationHelper().getHomePage().getRegionInHeader().equals("Севастополь"));
		
		app.getNavigationHelper().openHomePage().setRegionInHeader("Вся Украина");
		assertTrue(app.getNavigationHelper().getHomePage().getRegionInHeader().equals("Вся Украина"));
	}
	
	@Test
	public void changeRegionInFilterOnCatalogKNU()
	{
		
	}
}
