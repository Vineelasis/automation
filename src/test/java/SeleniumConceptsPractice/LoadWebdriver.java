package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoadWebdriver {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.get("https://www.flipcart.com");
	}
}
