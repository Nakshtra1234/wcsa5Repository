package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromeProperty {

	public static void main(String[] args) throws IOException {
		//Read the data from config.propertise file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create a object for property class
		Properties prop = new Properties();
		
		//make a file  ready for read
		prop.load(fis);
		
       //read the particular property from file
		String data = prop.getProperty("Username");
		System.out.println(data);
		
	}

}
