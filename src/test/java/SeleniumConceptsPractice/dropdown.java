package SeleniumConceptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dropdown {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new account button
		driver.findElement(By.xpath("//a[@id='u_0_0_D3'])")).click();
		// select day dropdown
		//Thread.sleep(5000);
	//	WebElement day=driver.findElement(null) 
		
	}

}
