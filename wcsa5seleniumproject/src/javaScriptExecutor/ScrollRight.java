package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the wed application
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//To perform scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("wondow.scrollBy(5000,0)");
	}

}
