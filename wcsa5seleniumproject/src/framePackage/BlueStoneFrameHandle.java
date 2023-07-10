package framePackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(frameElement);
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		
		
		chatBox.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("nakshtra");
		driver.findElement(By.id("chat-fc-email")).sendKeys("naksh@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		

	}

}
