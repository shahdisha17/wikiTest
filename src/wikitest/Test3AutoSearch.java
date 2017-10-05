package wikitest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.factory.BrowserFactory;
import wikitestpages.Test1SearchBarPage;
import wikitestpages.Test2ContentsPage;
import wikitestpages.Test3AutocompleteSearchPage;

public class Test3AutoSearch {
	
  @Test
  public void autoSearchTest() {
	  WebDriver driver=BrowserFactory.startBrowser("firefox", "https://www.wikipedia.org/");
	  Test1SearchBarPage searchbar=new Test1SearchBarPage(driver);
	  searchbar.typeSearchtext("Puppies");
	  searchbar.clickSearchbutton();
	  
	  Test3AutocompleteSearchPage autoSearchTest=new Test3AutocompleteSearchPage(driver);
	  autoSearchTest.typeSearchwiki();
	  autoSearchTest.selectDropDown();
	  
	  	  
	  Assert.assertEquals(driver.getTitle(),"France - Wikipedia");
	  System.out.println("Page title verified");
	  
	  String francePageHeader = searchbar.getContent();
	  Assert.assertEquals(francePageHeader, "France");
	  System.out.println("Heading content verified");
  }


}
