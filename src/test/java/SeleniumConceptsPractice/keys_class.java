package SeleniumConceptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class keys_class {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//enter valid UN,valid PWD,and click on login button
		driver.findElement(By.id("//input[@name='email']")).sendKeys("vinay",Keys.TAB,"hello",Keys.ENTER);
	}

}
