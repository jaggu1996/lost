package Test2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POJO.Jaggu1;
import POM.ZerodaLoginPage;
import POM.ZerodaPinPage;
import POM.ZerodaStockPage;
import Utility.Paramatrization;

public class ZerodaStockPageTest {
	WebDriver driver;
	@Test
	public void browseropen() throws InterruptedException, EncryptedDocumentException, IOException {
		
		 driver=Jaggu1.openBrowser12();
   
			ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
			
		String userName	=Paramatrization.getData(0,1);
		String password = Paramatrization.getData(1,1);
		zerodaLoginPage.enterUserId(userName);
		zerodaLoginPage.enterpassword(password);
		zerodaLoginPage.clikonLogin();
		Thread.sleep(5000);
		
	
		ZerodaPinPage zerodaPinPage = new ZerodaPinPage(driver);
		String pin = Paramatrization.getData(2,1);
		  System.out.println(pin);
		  zerodaPinPage.enterpin(pin);
		  zerodaPinPage.clickOnContiniue();
		
		 
		 ZerodaStockPage zerodaStockpage = new  ZerodaStockPage( driver);
		 Thread.sleep(1000);
		  String address   = Paramatrization.getData(3, 1);
		  zerodaStockpage.clickonsearch(address);
		  System.out.println(address);
		  zerodaStockpage.clickOnBuy(driver);
		  zerodaStockpage.ClickOnTarget(driver);
		  zerodaStockpage.ClickOnStoploss(driver);
		   
		 
		 
		     
		 
		
		
	}

}
