package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getcurrenturl {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);

}
}