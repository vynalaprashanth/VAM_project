import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPr {

	static WebDriver driver;
	
	
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
		
		
	}

}
