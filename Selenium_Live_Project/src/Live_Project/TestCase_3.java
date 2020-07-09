package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_3 {
	WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase3() {
        // Check the url of the header image
    	//WebElement img = driver.findElement(By.tagName("img"));
    	//String url = img.getAttribute("src");
    	String url=driver.findElement(By.tagName("img")).getAttribute("src");
            
        //Print the url of the header image
        System.out.println("Image url is: " + url);
            
        //https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg
          }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
