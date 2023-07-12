package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class testNGPractice {

@BeforeClass
	public void launchmethod() {
	System.out.println("launched");
	}
@BeforeTest
public void enterUrl() {
	System.out.println("URl");
}
	
}
