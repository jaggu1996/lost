package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaStockPage {
	
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="(//span[text()='TATACOFFEE'])[1]")private WebElement TATACOFEE;
	@FindBy(xpath="(//button[@class='button-blue'])[1]")private WebElement buy;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")private WebElement stoploss;
	@FindBy(xpath="//input[@id='checkbox-207']")private WebElement Target;
	
	
	public ZerodaStockPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	   public void clickonsearch(String address) {
		   search.click();
		   search.sendKeys(address);
	   }
	   public void clickOnBuy(WebDriver driver) {
		   Actions action = new Actions(driver);
		   action.moveToElement(TATACOFEE);
		   action.click();
		   action.perform();
		   action.moveToElement(buy);
		   action.perform();
		   action.click();
		   action.perform();
	   }
		   public void ClickOnStoploss(WebDriver driver) {
			   Actions action = new Actions(driver);
			   action.moveToElement(Target);
			   action.click();
			   action.perform();
		   }
		   public void ClickOnTarget(WebDriver driver) {
			   Actions action = new Actions(driver);
			   action.moveToElement(Target);
			   action.click();
			   action.perform();
		   }
		   
	   

}


