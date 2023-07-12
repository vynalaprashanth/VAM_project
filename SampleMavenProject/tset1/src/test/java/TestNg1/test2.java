package TestNg1;

import org.testng.annotations.Test;

public class test2 extends baseTest {

	
	
	String url="https://www.amazon.in/ ";
	@Test
	public void t3() {
		
		driver.get(url);
		
		
		System.out.println("Amazon Link is: "+url);
	}
}
