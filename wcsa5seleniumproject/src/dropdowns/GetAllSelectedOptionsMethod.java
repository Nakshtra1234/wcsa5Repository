package dropdowns;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/multiSelectDropDown.html");
		
		//identify dropdown
		WebElement dropdownElement = driver.findElement(By.id("i1"));
		
		//handle the dropdown
		Select sel = new Select(dropdownElement);
		
		//select multiple options from dropdowns
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//To read all selected options from dropdown
		List<WebElement> allOpts = sel.getAllSelectedOptions();
		
		//To read list of webElement we use loop.....
//	    for(WebElement op:allopts)
//        {
//       	Thread.sleep(2000); //       
//		system.out.println(op.getText())
//	   }
		
		for(int i=0;i<allOpts.size();i++)
		{
			Thread.sleep(2000);
			System.out.println(allOpts.get(i).getText());
		}
	}

}
