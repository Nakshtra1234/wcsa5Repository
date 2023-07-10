package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/confirmationpopup.html");
		
		//To generate confirmation popup click on submit button
		driver.findElement(By.tagName("input")).click();
		
		//Handle confirmation popup by using switchTo()
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
//		al.accept();
		
//		al.dismiss();
		
		System.out.println(al.getText());
		al.accept();
//		al.sendKeys(al.getText());  //This line throws the exception NoAlertPresentException--It is from Selenium Package.
		

	}

}