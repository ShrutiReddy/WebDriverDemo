package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		System.out.println("Before webdriver starts");
		//this.driver= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/shruti/Documents/workspace-mars/WebDriverDemo/geckodriver");
		this.driver = new FirefoxDriver();
		System.out.println("After webdriver start");
		
		start();
	}
	
	public void start(){
		driver.get("http://www.verizon.com/home/verizonglobalhome/ghp_landing.aspx");
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
