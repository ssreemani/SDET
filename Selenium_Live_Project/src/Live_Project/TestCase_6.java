package Live_Project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_6 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase6() {
        // navigate to the Jobs page 	    	 
    	driver.findElement(By.id("menu-item-24")).click();
        
    	// Search for a particular job and wait for listings to show
    	driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("test");
    	driver.findElement(By.xpath("//input[@id='search_location']")).sendKeys("Kolkata");
    	driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //Click and open any one of the jobs listed.
    	driver.findElement(By.xpath("//div[@class='position']//following::h3[1]")).click();
    	
    	//Click the apply button and print the email to the console
    	driver.findElement(By.xpath("//input[@class='application_button button']")).click();
    	String s= driver.findElement(By.xpath("//div[@class='application_details']")).getText();
    	System.out.println(s);
    	
        //Assertion for job applied successfully
    	Assert.assertEquals("To apply for this job please visit www.ambrino.com.", s);
          }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
