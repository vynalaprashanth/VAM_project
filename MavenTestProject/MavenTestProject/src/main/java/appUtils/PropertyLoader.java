package appUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropertyLoader  {
	
	public static File file = new File("src\\main\\resources\\appFiles\\login.properties");
    public static Properties prop;
	
	public PropertyLoader() {
		
		

		try {
			
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);			
						
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		finally {
			
			if(file.exists()) {
				System.out.println("File Connected");
			}else
			{
				System.out.println("Does not connected");
			}
			
	}
	
		
		//Create Methods for properties
	}
	
	
	public String getUserName() {
		return prop.getProperty("username");
	}
	
	public String getvalidPassword() {
		return prop.getProperty("validPassword");
	}
	
	public String getInvalidPassword() {
		return prop.getProperty("invalidPassword");
	}
	
	
	
	
}

