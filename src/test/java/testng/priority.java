package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=3)
	public void hi()
	{
		Reporter.log("executing vinny",true);
		
	}

@Test(priority=5)

	public void hello()
	{
		Reporter.log("executing good",true);
	}
}



