package SeleniumConceptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https:\\www.w3schools.com/html/html5_draganddrop.asp");
//src element
WebElement src=driver.findElement(By.xpath("//img[@id='drag1']"));
//destination element
WebElement destination=driver.findElement(By.xpath("//div[@id='div2']"));
//use actions class
Actions act=new Actions(driver);
act.dragAndDrop(src, destination).perform();

	}

}
