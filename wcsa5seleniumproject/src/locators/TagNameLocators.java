package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.facebook.com/");
		WebElement usn = driver.findElement(By.tagName("input"));
		usn.sendKeys("qspiders");
		driver.findElement(By.tagName("input")).sendKeys("qspiders");
	}

}