package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaLoginPage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement UserId;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()=\"Forgot user ID or password?\"]")private WebElement forgot;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
	
	
    public ZerodaLoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterUserId(String user) {
    	UserId.sendKeys(user);
    }
    public void enterpassword(String pass) {
    	password.sendKeys(pass);
    }
    public void clikonLogin() {
    	login.click();
    }
    public void clickonForgot() {
    	forgot.click();
    }
    public void clickonSignUp() {
    	signup.click();
    }
    
    	
    	
    }
	


