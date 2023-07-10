package readExelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=1bmociq1yg1pk");
	
	//read the data from excel file and test the login page
	FileInputStream fis2 = new FileInputStream("./data/ActiTimeData.xlsx.xlsx");
    Workbook wb1 = WorkbookFactory.create(fis2);
   Sheet sheet = wb1.getSheet("validcreds");
   Row row = sheet.getRow(1);
   Cell cell = row.getCell(0);
   String validUsername = cell.getStringCellValue();
   
   Thread.sleep(2000);
   
  
   
   
	}

}
