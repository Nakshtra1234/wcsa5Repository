package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign up']\")")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobile']\")")).sendKeys("9022222222");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']\")")).click();


	}

}
