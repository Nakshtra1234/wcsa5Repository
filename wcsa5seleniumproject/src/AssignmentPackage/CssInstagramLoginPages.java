package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssInstagramLoginPages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='userna']")).sendKeys("NakshtraRokade");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='sword']")).sendKeys("naksh@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='_acan _acap']")).click();
		
	}

}
