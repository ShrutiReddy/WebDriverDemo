package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BasePage;

public class WirelessPage extends BasePage{

	public WirelessPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
/*	
	public String alert(){
		driver.findElements(By.xpath("//a[@class='button cta-text block text-black']")).get(0).click();
		driver.findElement(By.xpath("//div[@id='oo_tab']")).click();
		//a[@class='waypoint_icon last']
		String newWindow= driver.getWindowHandle();
		driver.switchTo().window(newWindow);
		driver.findElement(By.xpath("//a[@class='waypoint_icon last']")).click();
		String window2 = driver.getWindowHandle();
		driver.switchTo().window(window2);
		String url=driver.getCurrentUrl();
		return url;
	}*/
	
	public String alert(){
		driver.findElements(By.xpath("//a[@class='button cta-text block text-black']")).get(0).click();
		driver.findElement(By.xpath("//div[@id='oo_tab']")).click();
		Set<String> pages=driver.getWindowHandles();
		Iterator<String> it = pages.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		String childWindow2 = it.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//a[@class='waypoint_icon last']")).click();
		driver.switchTo().window(childWindow2);
		String url=driver.getCurrentUrl();
		return url;
		
		

}
	public String mouseHoover(){
		
		driver.findElements(By.xpath("//a[@class='button cta-text block text-black']")).get(0).click();
		WebElement move=driver.findElement(By.xpath("//a[@id='onavmenu1']"));
		WebElement subType = driver.findElement(By.xpath("//a[@title='Plans & Services']"));
		WebElement type=driver.findElement(By.xpath("//a[@title='Prepaid Plans']"));
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();
		act.moveToElement(subType).perform();
		act.click(type).perform();
		String s = driver.getTitle();
		
		return s;
	}
	public int countLinks(){
		
		driver.findElements(By.xpath("//a[@class='button cta-text block text-black']")).get(0).click();
		List<WebElement> count =driver.findElements(By.xpath("//div[@class='footerMainLinksRow']/div/ul/li/a"));
		int size=count.size();
		
		return size;
	}
}
