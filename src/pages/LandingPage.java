package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BasePage;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);

	}

	public int headerCount() {

		List<WebElement> header = driver.findElements(By.cssSelector(".main_lob>ul>li"));
		int count = header.size();

		return count;

	}
	public List<WebElement> footerText(){
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='gb']/ul/li/a"));
		System.out.println(li.size());
		for(WebElement w:li){
			System.out.println("Text name " + w.getText());
		}
		
		return li;
		
		
	}
	public boolean logo(){
		WebElement l=driver.findElement(By.xpath("//img[@alt='Verizon logo']"));
		boolean text=l.isEnabled();
		return true;
	}
	
	public List<WebElement> headerText(){
		List<WebElement> header = driver.findElements(By.cssSelector(".main_lob>ul>li"));
	   System.out.println(header.size());
	   
	   for(WebElement list:header){
		   System.out.println("Text name " + list.getText());
	   }
	   
	   return header;
		
	}
	
	public String getStarted(){
		String s=null;
		driver.findElements(By.xpath("//a[@class='button cta-text block text-black']")).get(0).click();
		String newurl= driver.getCurrentUrl();
		
		return newurl;
		
		
	}

}
