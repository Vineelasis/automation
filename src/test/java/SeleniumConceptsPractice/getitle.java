package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getitle {
	public static void main(String[] args) {
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.amazon.com");
			System.out.println(driver.getTitle());
	}

}
