package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class vtiger {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/");
	}

}
