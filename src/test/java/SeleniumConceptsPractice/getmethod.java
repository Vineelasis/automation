package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getmethod {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		//to minimize the webpage window we need to use
		driver.manage().window().maximize();
		
	}

}
