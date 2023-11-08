package SeleniumConceptsPractice;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alertpopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//give customer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	//click on submit button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(5000);
	//use alert interface methods
Alert al=driver.switchTo().alert();
//click on cancel btn
al.dismiss();

}
}