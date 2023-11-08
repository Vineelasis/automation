package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class paralleexecution1 {
@Test
public void tc2() {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
}
}
