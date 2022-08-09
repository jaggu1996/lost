package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jaggu1 {
	public static WebDriver openBrowser12() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RITU\\Downloads\\navin path ahe\\cromedriver (102)new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		return driver;
		
	}

}
