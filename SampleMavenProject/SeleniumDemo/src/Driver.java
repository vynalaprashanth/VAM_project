import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	
	
	
	
	public static WebDriver bro (String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				return new ChromeDriver();
		
	}else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}
		return null;
		
	
	}
}
