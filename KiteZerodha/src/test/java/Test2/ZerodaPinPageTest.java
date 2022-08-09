package Test2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import POJO.Jaggu1;
import POM.ZerodaLoginPage;
import POM.ZerodaPinPage;
import Utility.Paramatrization;

public class ZerodaPinPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver=Jaggu1.openBrowser12();
	}
	
	@Test
	
	public void loginToZerodhaWithpinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
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
		
		

}
}
