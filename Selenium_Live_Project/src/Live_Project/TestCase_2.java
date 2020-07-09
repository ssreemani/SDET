package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_2 {
	WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase2() {
        // Check the heading of the page
        String heading=driver.findElement(By.className("entry-title")).getText();
            
        //Print the heading of the page
        System.out.println("Page Heading is: " + heading);
            
        //Assertion for heading page
        Assert.assertEquals("Welcome to Alchemy Jobs", heading);       
          }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
