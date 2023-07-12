package SeleniumExamples;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Ex2 extends browser {
	
	static String[] browser= {"Chrome","Edge"};
	static String[]url= {"http://www.google.com/","http://www.amazon.in/"};
  @Test
  public void browse() {
	  
	  
	  for(int i=0;i<=browser.length-1;i++) {
		
		 getBrowser(browser[i],url[i]);
	  }

  }

@AfterSuite
public void close() {
	
	driver.quit();
}
	
}
