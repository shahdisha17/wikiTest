package wikitest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.factory.BrowserFactory;
import wikitestpages.Test1SearchBarPage;
import wikitestpages.Test2ContentsPage;

public class Test2HideContents {
  @Test
  public void hideContents() 
  {
      WebDriver driver=BrowserFactory.startBrowser("firefox", "https://www.wikipedia.org/");
	  Test1SearchBarPage searchbar=new Test1SearchBarPage(driver);
	  searchbar.typeSearchtext("Puppies");
	  searchbar.clickSearchbutton();
	  
	  Test2ContentsPage contentshide=new Test2ContentsPage(driver);
	  contentshide.hideContentslink();
	  
	  Assert.assertEquals("show",contentshide.getHiddenContentsLinkText());
	  
	 /* WebElement element= driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/ul/li[2]/a"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
	  
	  String expectedTitle="Portal:Contents - Wikipedia";
	  String actualTitle=driver.getTitle();
	  assertEquals(actualTitle,expectedTitle);
	  System.out.println("True");*/
  }
 
}
