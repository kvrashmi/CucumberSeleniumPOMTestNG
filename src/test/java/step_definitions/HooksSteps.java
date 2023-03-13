package step_definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksSteps {
	static WebDriver driver=null;
	
	@Before
	public void SetUp()
	{
		driver=util.BrowserFactory.setUp();		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	@After
	public void tearDown()
	{
		//util.BrowserFactory.tearDown();
	}
}
