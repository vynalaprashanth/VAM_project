package AppHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApBase {
	
	
	
	@Before(order=0)
	public void startBrowser() {
		System.out.println("Start Google browser");
	}
	
	
	@Before(order=1)
	public void clickOnSampleLink() {
		System.out.println("Click sample link");
	}
	
	
	@After(order=0)
	public void closeSampleLink() {
		System.out.println("Click close sample");
	}
	
	@After(order=1)
	public void closeTest() {
		System.out.println("Close Browser");
	}
	

}
