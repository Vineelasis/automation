package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipcart.com");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
	}

}
