package SeleniumConceptsPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollhandling {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com");
	// scroll down
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)");
	// scroll up
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,-1000)");
	
	
		
		
		}
		
		
}
