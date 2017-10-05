package wikitest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.factory.BrowserFactory;
import wikitestpages.Test1SearchBarPage;
 

public class Test1SearchBar {
	
	
  @Test
  public void checkWikipagePuppies() 
  {
	  WebDriver driver=BrowserFactory.startBrowser("firefox", "https://www.wikipedia.org/");
	  
	  Test1SearchBarPage searchbar=new Test1SearchBarPage(driver);
	  searchbar.typeSearchtext("Puppies");
	  searchbar.clickSearchbutton();
	  
	  Assert.assertEquals(driver.getTitle(),"Puppy - Wikipedia");
	  System.out.println("Page title verified");
	  
	  String puppyPageHeader = searchbar.getContent();
	  Assert.assertEquals(puppyPageHeader, "Puppy");
	  System.out.println("Heading content verified");
  }


}

