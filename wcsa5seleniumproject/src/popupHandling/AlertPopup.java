package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/AlertPopup.html");
		//To generaate pop up click on button
		driver.findElement(By.xpath("//button[@type='button']"));
		//handle alert pop up using robot class....
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
         
		 //handle Alert popup by using switchTO()
		 Alert al = driver.switchTo().alert();
		 Thread.sleep(2000);
		 al.accept(); //for accept the alert pop up
		 al.dismiss(); //for dismiss the alert pop up
		 al.getText();
	}

}
