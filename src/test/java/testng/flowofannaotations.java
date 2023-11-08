package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class flowofannaotations {
	// TODO Auto-generated constructor stub
	@BeforeSuite
	public void  m1()
	{
		Reporter.log("___DB CONNECTION___",true);
	}
	@BeforeClass
public void m2()
{
	Reporter.log("___LAUNCH THE BROWSER___",true);
}
	@AfterMethod
public void m3()
{
	Reporter.log("___OPEN THe APP___",true);
}
@BeforeMethod	
public void m4()
{
	Reporter.log("___LOGIN TO APP___",true);
}
@AfterClass
public void m5()
{
	Reporter.log("____CLOCS THE BROWSER___",true);
}
@AfterSuite
public void m6()
{
	Reporter.log(null);
}
@Test
public void m7()
{
	Reporter.log("___MAIN TC__",true);
}
}