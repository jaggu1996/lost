package Utility;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Jaggu1;

public class Screenshot {
	public static void main(String[] args) throws IOException {
       WebDriver driver = Jaggu1.openBrowser12();
           File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           
           File destination = new File("C:\\Users\\RITU\\OneDrive\\Desktop\\jaggu\\vctc.jpeg");
           
           FileHandler.copy(source, destination);
           
	} 

}
