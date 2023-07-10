package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaselectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("nakshtra");
		 Thread.sleep(2000);

		 driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("naksh15");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[name='login']")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}
}

