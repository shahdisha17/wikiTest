package wikitest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.factory.BrowserFactory;
import wikitestpages.TestPageModel;
 

public class TestWiki {
	
	WebDriver driver=BrowserFactory.startBrowser("firefox", "https://www.wikipedia.org/");
	TestPageModel searchbar=new TestPageModel(driver);
	
	
  @Test(priority=0)
  public void checkWikipagePuppies() 
  {
	  
	  searchbar.typeSearchtext("Puppies");
	  searchbar.clickSearchbutton();
	  
	  Assert.assertEquals(driver.getTitle(),"Puppy - Wikipedia");
	  System.out.println("Page title verified");
	  
	  String puppyPageHeader = searchbar.getContent();
	  Assert.assertEquals(puppyPageHeader, "Puppy");
	  System.out.println("Heading content verified");
  }
  
  @Test(priority=1)
  public void hideContents() 
  {
	  
	  searchbar.hideContentslink();
	  Assert.assertEquals("show",searchbar.getHiddenContentsLinkText());
	 
  }
  
  
  @Test(priority=2)
  public void autoSearchTest() {

	  
	  searchbar.typeSearchwiki();
	  searchbar.selectDropDown();
	  
	  	  
	  Assert.assertEquals(driver.getTitle(),"France - Wikipedia");
	  System.out.println("Page title verified");
	  
	  String francePageHeader = searchbar.getContent();
	  Assert.assertEquals(francePageHeader, "France");
	  System.out.println("Heading content verified");
  }


}

