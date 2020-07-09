package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_5 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase5() {
        // Check the navigation bar 
    	// Select the menu item that says �Jobs� and click it 
    	WebElement bar =driver.findElement(By.id("menu-item-24"));
    	bar.click();
    	    	 
    	//driver.findElement(By.id("menu-item-24")).click();
        
    	// Check the title of the Job page
    	String title = driver.getTitle();
    	
    	//Print the title of the Job page 
        System.out.println("Page title in Job page is: " + title);
            
        //Assertion for Read the page title and verify that you are on the correct page
        Assert.assertEquals("Jobs � Alchemy Jobs", title);
          }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
