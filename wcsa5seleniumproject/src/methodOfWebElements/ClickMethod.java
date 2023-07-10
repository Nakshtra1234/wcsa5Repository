package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
   
 public static void main(String[]aregs) {
	 System.setProperty("webdriver.chrome.driver","/drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/singleselectdropdown.html");
	//WebElement dropDown=driver.findElement(By.id("menu"));
	//dropDown.click();
	
	driver.findElement(By.id("menu")).click();
	
	}

}
