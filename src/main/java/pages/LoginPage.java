package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	//WebElements List
	@FindBy(how=How.XPATH,using="//input[@id='username']")WebElement USER_NAME;
	@FindBy(how=How.XPATH,using="//input[@id='password']")WebElement PASS_WORD;
	@FindBy(how=How.NAME,using="login")WebElement SIGNIN_BUTTON;
	@FindBy(how=How.XPATH,using="//div[contains(@class,\"alert alert-danger fade in\")]")WebElement INVALID_TEXT;
	
	
	//Methods
	public void inputUserName(String userName)
	{
		USER_NAME.sendKeys(userName);
	}
	
	public void inputPassWord(String passWord)
	{
		PASS_WORD.sendKeys(passWord);
	}
	
	public void login()
	{
		SIGNIN_BUTTON.click();
	}
	
	public String getTextOfDashboard()
	{
		return driver.getTitle();
	}
	
	public String getTextOfInvalidText()
	{
		System.out.println(INVALID_TEXT.getText().trim());
		return INVALID_TEXT.getText().trim();
	}
}
