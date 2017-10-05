

	package wikitestpages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	/**
	 * @author Disha
	 *
	 *  This class will store all the locator and method of Test2Contests page
	 */
	public class Test2ContentsPage {
		
		WebDriver driver;
		
		//By findContents=By.xpath("/html/body/div[4]/div[2]/div[2]/div/ul/li[2]/a");
		By hideContents = By.xpath("/html/body/div[3]/div[4]/div[4]/div/div[5]/div/span/a");
	    
	    public Test2ContentsPage(WebDriver driver)
	    {
	    	this.driver=driver;
	    }
	   /* public void typeFindcontents()
	    {
	    	driver.findElement(findContents).click();
	    }*/
	    
	    public void hideContentslink(){
	    	driver.findElement(hideContents).click();
	    }
	    
	    public String getHiddenContentsLinkText(){
	    	return driver.findElement(hideContents).getText();
	    }
	}

	