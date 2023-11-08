package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batchexecution2 {
@Test
public void sample5()
{
	Reporter.log("executing five",true);
	
}
@Test
public void sample6()
{
	Reporter.log("executing six",true);
	
}
}