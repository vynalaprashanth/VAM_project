package utillls;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	
static WebDriver driver;
	
	public static WebDriver startBrowser(String browserType) {
		
		if(browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserType.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserType.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		
		driver.manage().window().maximize();
		
		
		
		return driver;
		
	}
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
    public void screenshort(String name) throws IOException {
    	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	String fileName = System.getProperty("user.dir")+ File.separator+"target"+ File.separator+name+".png";
    	FileUtils.copyFile(src, new File(fileName));	
    }
    public void closeBrowser() {
    	driver.quit();
    }
}
