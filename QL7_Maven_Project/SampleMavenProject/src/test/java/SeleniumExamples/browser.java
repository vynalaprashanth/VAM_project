package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class browser {

	
	static WebDriver driver ; 
	public WebDriver getBrowser(String browserName,String browserUrl) {
	
		
		if(browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			//System.out.println("");
		}else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		
		}driver.get(browserUrl);
	
	    driver.close();
		return driver;
		
		
	}
	
		
	}


