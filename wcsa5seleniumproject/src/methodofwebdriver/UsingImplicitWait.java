package methodofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("")).click();

	}

}
