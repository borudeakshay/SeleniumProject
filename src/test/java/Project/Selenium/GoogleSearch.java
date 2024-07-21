package Project.Selenium;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	
	@Test
	public void googleSearch() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.findElement(By.id("APjFqb")).sendKeys("Java");
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	
	System.out.println("total number of suggestions in search box:::===>" + list.size());
	
	for(int i=0; i<list.size(); i++){
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("javatpoint")){
			list.get(i).click();
			break;
		}
	}
	}
}

