package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.selenium.dev/");
	    
	    //To perform scrolling operatiion
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    
	   //scrool down
	    Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,1000)");
	    

	}

}
