package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut=1000)
	public void demo()
	{
		Reporter.log("vinay",true);
	}
}
