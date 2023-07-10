package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/multiSelectDropDown.html");
		

		//identify dropdown
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown
		Select sel = new Select(dropdownElement);
	
	//To read all selected options from dropdown
//	List<WebElement> allopts = sel.getAllSelectedOptions();
//    for(WebElement op:allopts)
//    {
//   	Thread.sleep(2000); //       
//	system.out.println(op.getText())
//   }

 WebElement allopts = sel.getWrappedElement();
 
 System.out.println(allopts.getText());
	}

}
