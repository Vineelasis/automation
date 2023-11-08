package pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	// declaration
	@FindBy(xpath = "//input[@name='email']")private WebElement emailtxt;
	@FindBy(xpath = "//input[@name='pass']")private WebElement pwdtxt;
	@FindBy(xpath = "//button[@id='loginbutton']")private WebElement loginbtn;
	@FindBy(xpath = "//a[@role='button']")private WebElement createnewaccountbtn;
	//initialization
	public loginpage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}
//utilization
	public WebElement getUntxt() {
		return emailtxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
		
	}
	
	public WebElement getCreatenewaccountbtn() {
		return createnewaccountbtn;
	}
}
