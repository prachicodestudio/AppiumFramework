package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class SearchTest extends BaseClass{

	@Test
	public void test1() throws InterruptedException
	{
	
		
	
   /* driver.get("https://www.google.com/");
      
//      //find search box web element
      WebElement searchBox = driver.findElement(By.name("q"));
      
      searchBox.sendKeys("Taj mahal");
      searchBox.sendKeys(Keys.RETURN);*/
		
		
		GoogleSearchPage pg = new GoogleSearchPage(driver);
		driver.get("https://www.google.com/");
		
		pg.EnterSearchData("Taj Mahal");
		pg.PressEnterKeyOnSearchBox();
		
		Thread.sleep(5000);
		
		
		
	}
	
	@Test
	public void test2() throws InterruptedException
	{
	
		
	
   /* driver.get("https://www.google.com/");
      
//      //find search box web element
      WebElement searchBox = driver.findElement(By.name("q"));
      
      searchBox.sendKeys("Taj mahal");
      searchBox.sendKeys(Keys.RETURN);*/
		
		
		GoogleSearchPage pg = new GoogleSearchPage(driver);
		driver.get("https://www.google.com/");
		
		pg.EnterSearchData("qutub minar");
		pg.PressEnterKeyOnSearchBox();
		
		Thread.sleep(5000);
		
		
		
	}
}
