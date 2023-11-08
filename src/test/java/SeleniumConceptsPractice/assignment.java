package SeleniumConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment {
	public static void main(String args[])
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		 driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
		 String s=driver.getTitle();
		 System.out.println(s);
	}

}
