package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("file:///C:/Users/nakshtra/Desktop/wcsa5/singleselectdropdown.html");
        
        //identify dropdown on a webpage
        WebElement dropDownElement = driver.findElement(By.id("menu"));  
        
      //handle the dropdown by creating objet of select....
        Select sel = new Select(dropDownElement);
        
        //read all the options of dropdown
        List<WebElement> allOps = sel.getOptions();
        
        //To read List use looping statement
        for(WebElement op: allOps)
        {
        	if(op.getText().equals("Pani Puri"))
        	{
        	Thread.sleep(2000);
        	op.click();
        	break;
        	}
        }
	}
}

