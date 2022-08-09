package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaPinPage {
	
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()=\"Forgot 2FA?\"]")private WebElement forgot;
	@FindBy(xpath="(//a[@target=\"_blank\"])[3]")private WebElement signup;
	
	public ZerodaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String pinnumber) {
		pin.sendKeys(pinnumber);
	}
	public void clickOnContiniue() {
		submit.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnsignup() {
		signup.click();
	}
		
}


