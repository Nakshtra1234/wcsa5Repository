package methodofwebdriver ;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ManageToSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point point =new Point(200,150);
		driver.manage().window().setPosition(point);
	}

}
