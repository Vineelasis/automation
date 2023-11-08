package xlfetching;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\csc\\Desktop\\screenshot\\FB.png");
		Files.copy(src,dest);
		
		
	}

}
