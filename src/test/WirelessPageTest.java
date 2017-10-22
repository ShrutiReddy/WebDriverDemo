package test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.WirelessPage;


public class WirelessPageTest extends BaseTest{
	WirelessPage hp ;
	
	@BeforeClass
	public void test(){
		hp = new WirelessPage(driver);
		
	}
	
	@Test(enabled=false)
	public void windoeHandleTest(){
		String act= hp.alert();
		String exp="https://secure.opinionlab.com/ccc01/comment_card_d.asp";
		assertEquals(exp, act);
	}
	@Test
	public void mouseHover(){
		String act=hp.mouseHoover();
		String exp="Cell Phones, Smartphones & the Largest 4G LTE Network - Verizon Wireless";
		assertEquals(exp, act);
	}
	@Test
	public void countFooter(){
		int act=hp.countLinks();
		int exp=27;
		assertEquals(exp, act);
	}

}
