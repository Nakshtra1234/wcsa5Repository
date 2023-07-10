package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUndesrstandOperationalMethods {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/multiSelectDropDown.html");
    
    WebElement multiselectDD = driver.findElement(By.id("menu"));
     Select sel = new Select(multiselectDD);
     
     //isMultiple method
   boolean result = sel.isMultiple();
   System.out.println(result);
    
    
     //getOptions method
   List<WebElement> dropdownOptions = sel.getOptions();
   for(int i=0;i<dropdownOptions.size();i++)
   {
	   String options = dropdownOptions.get(i).getText();
	   System.out.println(options);
	   Thread.sleep(1000);
   }
  List<WebElement> ops = sel.getOptions();
  for(WebElement we:ops) 
  {
	  String textOfops = we.getText();
	  System.out.println(textOfops);
	  
  }
  
  for(int i=2;i<=4;i++)
  {
	 sel.selectByIndex(i);
  }
 
 WebElement firstOption = sel.getFirstSelectedOption();
 System.out.println("first selected options is :"+firstOption.getText());
 
	}

}
