package ua.st.selenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class RegionTest extends TestNgTestBase
{
	@Test
	public void changeRegionInHeaderOnMain()
	{
		app.getNavigationHelper().openHomePage().setRegionInHeader("�����������");
		assertTrue(app.getNavigationHelper().getHomePage().getRegionInHeader().equals("�����������"));
		
		app.getNavigationHelper().openHomePage().setRegionInHeader("��� �������");
		assertTrue(app.getNavigationHelper().getHomePage().getRegionInHeader().equals("��� �������"));
	}
	
	@Test
	public void changeRegionInFilterOnCatalogKNU()
	{
		
	}
}
