package TestNg1;

import org.testng.annotations.Test;

public class test1 extends baseTest {

	@Test
	public void t2() throws InterruptedException {
		{

			String ur = "https://www.mycontactform.com";
			driver.get(ur);
			System.out.println("Printed url : " + ur);
			Thread.sleep(5000);

		}

	}
}
