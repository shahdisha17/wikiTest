/**
 * 
 */
package wikitestpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * @author Disha
 *
 *
 *This class will store all the locator and method of Test3Autocompletesearch page
 */
public class Test3AutocompleteSearchPage {
    WebDriver driver;
	By searchWiki=By.id("searchInput");

public Test3AutocompleteSearchPage(WebDriver driver)
{
	this.driver=driver;
}
public void typeSearchwiki()
{
	driver.findElement(searchWiki).sendKeys("Franc",Keys.DOWN);
}
public void selectDropDown()
{
	driver.findElement(By.xpath("/html/body/div[6]/div/a[2]/div")).click();
}
}