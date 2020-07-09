package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_4 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase4() {
        // Check the second heading of the website 
    	String heading2=driver.findElement(By.tagName("h2")).getText();
            
        //Print the second heading of the website 
        System.out.println("Second heading on the page is: " + heading2);
            
        //Assertion for second heading of the website
        Assert.assertEquals("Quia quis non", heading2);
          }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
