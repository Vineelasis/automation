package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batchexecution {
	@Test
	public void sample1()
	{
		Reporter.log("executin one",true);
	}
@Test
public void sample2()
{
	Reporter.log("executing two",true);
	
}
}
