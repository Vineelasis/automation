package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batchexecution1 {
	@Test
	public void sample3()
	{
		Reporter.log("executing three",true);
	}
	@Test
	public void sample4()
	{
		Reporter.log("executing four",true);
	}

}
