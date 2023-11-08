package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class paralleexecution {
	@Test
	public void tc1() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
	
	}

}
