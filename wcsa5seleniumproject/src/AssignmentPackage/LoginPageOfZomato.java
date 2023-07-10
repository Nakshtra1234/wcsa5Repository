package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfZomato {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        
        
        driver.findElement(By.linkText("Sign up")).click();
        
        driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("NakshtraRokde");
        
        driver.findElement(By.className("sc-1yzxt5f-9 bbrwhB")).sendKeys("ngrokade@gmail.com");
	}
}
      
        
        


	


