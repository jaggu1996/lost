package Test2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Jaggu1;
import POM.ZerodaLoginPage;
import Utility.Paramatrization;

@Listeners(TestListeners.class)

public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Openbrowser() {
	 driver	= Jaggu1.openBrowser12();
	}
		@Test
		public void LoginWithValidCredential() throws EncryptedDocumentException, IOException {
		 ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
		 
		String username = Paramatrization.getData(0,1);
		String password = Paramatrization.getData(1,1);
		 
		 
		 zerodaLoginPage.enterUserId(username);
		 zerodaLoginPage.enterpassword(password);
		 zerodaLoginPage.clikonLogin();
		 
			
		}
	}

