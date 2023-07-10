package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmennt2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
        WebDriver driver=new ChromeDriver(); //user to launch the chrome
        
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/username.html");
    
        
        driver.findElement(By.tagName("input")).sendKeys("admin"); //username
        Thread.sleep(2000);
        driver.findElement(By.tagName("input")).sendKeys("manager"); //password
        
        driver.findElement(By.name("n1")).sendKeys("admin");
        driver.findElement(By.name("n2")).sendKeys("manager");
        
        
        
        
	}

}
