package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class paralleexecution2 {
	@Test
	public void tc3() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com");
	}

}
