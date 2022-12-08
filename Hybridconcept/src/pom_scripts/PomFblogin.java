package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFblogin {
	
	@FindBy(id="email")
	private WebElement UnTbox;
	@FindBy(id="pass")
	private WebElement PwdTbox;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	//intialization
	public PomFblogin(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
//utilization
	public void UserName(String un)
	{
		UnTbox.sendKeys(un);
	}
	public void PassWord(String pwd)
	{
		PwdTbox.sendKeys(pwd);
		}
	public void ClickLogin()
	{
		loginBtn.click();
	}
}



