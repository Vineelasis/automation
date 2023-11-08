package SeleniumConceptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe {
	public static void main(String args[])throws Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_button_basic");
		//first of all switch selenium control from webpage to iframe
		driver.switchTo().frame("iframeResult");
		//click on click me button 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		
		
	}

}
