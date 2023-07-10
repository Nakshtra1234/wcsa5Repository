package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarLoginPage {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hotstar.com/in/home");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='icon-user-line soul-icon NAV_ICON_FONT_SIZE']")).click();
			driver.findElement(By.xpath("//span[@class='flex items-center']")).click();
					

	}

}
