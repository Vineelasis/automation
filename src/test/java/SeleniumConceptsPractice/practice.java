package SeleniumConceptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practice {
public static void main(String args[])
{
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("unifiedLocation1ClickAddress")).sendKeys("vineela123");
	
			
}
}
