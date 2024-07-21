package Project.Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	
	@Test
	public void screenshot() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("c://test.png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
}
