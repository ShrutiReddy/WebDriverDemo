package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
	
public WebDriver driver;
	
	/*
	
	@BeforeSuite
	public void beforeSuite(){
		
		driver = new FirefoxDriver();
		
	}*/
	
	/* @AfterSuite
	    public void afterSuite() {
	  driver.quit();
	    }*/

}
