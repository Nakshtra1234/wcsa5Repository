package robotActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit Wait
		//Launch Bluestone
		driver.get("https://www.bluestone.com/");
		
		//handle Hidden Vision popup
		driver.findElement(By.id("denyBtn")).clear();
		
		//Move To Watch Jewellery
		Actions act = new Actions(driver);
        WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery '] "));
        act.moveToElement(target).perform();
        
        driver.findElement(By.xpath("//a[text()='Band']")).clear();
        Thread.sleep(2000);
        
        //Click and Hold Filter By Text
        driver.findElement(By.xpath("//div[text()='Filter by']"));
        
        for(int i=1;i<=2;i++)
        {
        	act.doubleClick(target2).perform();
        	act.doubleClick(target2).perform();
        }
	}

}
