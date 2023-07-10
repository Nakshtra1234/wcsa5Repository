package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSpotify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/us/signup");
		
		driver.findElement(By.id("email")).sendKeys("naksh@gmain.com");

		driver.findElement(By.id("password")).sendKeys("nakshtra@123");
		
		driver.findElement(By.id("displayname")).sendKeys("nakshtrarokde");
		
		driver.findElement(By.id("month")).sendKeys("July");
		
		driver.findElement(By.id("day")).sendKeys("15");
		
		driver.findElement(By.className("Indicator-sc-hjfusp-0 benotq")).sendKeys("Female");

	}

}