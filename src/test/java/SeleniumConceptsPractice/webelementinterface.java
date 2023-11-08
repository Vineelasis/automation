package SeleniumConceptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webelementinterface {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dresses");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
String a=driver.findElement(By.xpath("//h2[text()='Deals in PCs']")).getText();
System.out.println(a);
}
}