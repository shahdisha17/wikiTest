/**
 * 
 */
package wikitestpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Disha
 *
 *  This class will store all the locator and method of Test1SearchBar page
 */
public class Test1SearchBarPage {
	
	WebDriver driver;
	
	By searchText = By.id("searchInput");
	By searchButton=By.xpath("/html/body/div[2]/form/fieldset/button");
	By puppyHeader = By.id("firstHeading");		
	
	public Test1SearchBarPage(WebDriver driver)
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
}
