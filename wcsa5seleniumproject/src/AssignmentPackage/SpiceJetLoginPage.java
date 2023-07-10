package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.spicejet.com/");
		
		driver1.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver1.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9876543210");
		
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("Akash@5566");
		
		driver1.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
	}
}
		

