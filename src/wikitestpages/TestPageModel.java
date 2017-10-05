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
 *  This class will store all the locator and method of Test1SearchBar page
 */
public class TestPageModel {
	
	WebDriver driver;
	
	By searchText = By.id("searchInput");
	By searchButton=By.xpath("/html/body/div[2]/form/fieldset/button");
	By puppyHeader = By.id("firstHeading");
	
	By hideContents = By.xpath("/html/body/div[3]/div[4]/div[4]/div/div[5]/div/span/a");
	
	By searchWiki=By.id("searchInput");
	By dropdown = By.xpath("/html/body/div[6]/div/a[2]/div");

	
	//Initialize Driver object
	public TestPageModel(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void typeSearchtext(String searchName)
	{
		driver.findElement(searchText).sendKeys(searchName);
	}
	public void clickSearchbutton()
	{
		driver.findElement(searchButton).click();
	}
	public String getContent(){
		return driver.findElement(puppyHeader).getText();
	}
	
	public void hideContentslink(){
    	driver.findElement(hideContents).click();
    }
    
    public String getHiddenContentsLinkText(){
    	return driver.findElement(hideContents).getText();
    }
    
    public void typeSearchwiki()
    {
    	driver.findElement(searchWiki).sendKeys("Franc",Keys.DOWN);
    }
    public void selectDropDown()
    {
    	driver.findElement(dropdown).click();
    }
}
