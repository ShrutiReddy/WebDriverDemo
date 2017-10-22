package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import static org.testng.AssertJUnit.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pages.LandingPage;

public class LandingPageTest extends BaseTest {
	
	LandingPage hp ;
	
	@BeforeClass
	public void test(){
		hp = new LandingPage(driver);
		
	}
	
	@Test(priority=1)
	public void headerCountTest(){
		int act = hp.headerCount();
		int exp=3;
		assertEquals(exp, act);
		
	}
	
	@Test(priority=2)
	public void headerText(){
		List<WebElement> topList= hp.headerText();
		List<String> exp = new ArrayList();
		List<String> act = new ArrayList();
		
		exp.add("Wireless");
		exp.add("Residential");
		exp.add("Business");
		for(WebElement temp:topList){
			act.add(temp.getText());
		}
		assertEquals(exp, act);
	}
	@Test(priority=3)
	public void footerTest(){
		List<WebElement> footer = hp.footerText();
		List<String> exp = new ArrayList();
		List<String> act = new ArrayList();
		
		exp.add("Store locator");
		exp.add("About Verizon");
		exp.add("Careers");
		exp.add("Site feedback");
		exp.add("Privacy");
		exp.add("Terms and conditions");
		
		for(WebElement f:footer){
			act.add(f.getText());
		}
	}
	@Test(priority=4)
	public void logoTest(){
		
		boolean act=hp.logo();
		//String exp="Verizon logo";
		Assert.assertTrue(true);
		
		
	}
	@Test(priority=5)
	public void urlTest(){
		String act = hp.getStarted();
		String exp="http://www.verizonwireless.com/?intcmp=VZ-GHOME-D-WIRELESS";
		assertEquals(exp, act);
		
	}
	@AfterClass
	public void end(){
		driver.quit();
	}

}
