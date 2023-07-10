package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/multiSelectDropDown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		
		
		//to select using index
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		//To select using visible text
		sel.selectByVisibleText("Pani Puri");	
		Thread.sleep(2000);
		
		//To select using value
		sel.selectByValue("v5");
		Thread.sleep(2000);
		
		//To deselect using index
		sel.deselectByIndex(3);
		Thread.sleep(1000);
		
		//To deselect using visible text
		sel.deselectByVisibleText("Misal Pav");
		
		//TO deselect using value
		sel.deselectByValue("v5");
		
		//To select multiple options using for loop
		for(int i=0;i<5;i++);
		{
			sel.selectByIndex(1);
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		
		//To dselect multiple options using for loop
		for(int i=0;i<5;i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(1000);
			
			//T deselect all the optiion using 
			
		}
		

	}

}
