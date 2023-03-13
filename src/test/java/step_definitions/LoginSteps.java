package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	private static WebDriver driver;
	LoginPage lp =null;
	SoftAssert sa = new SoftAssert();
	
	@Given("^User is on the techfios landing page$")
	public void user_is_on_the_techfios_landing_page() {
		driver=HooksSteps.driver;
		driver.get("https://techfios.com/billing/?ng=admin/");
		lp=PageFactory.initElements(driver, LoginPage.class);
		
	}

	@Given("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username){
	   lp.inputUserName(username);
	}

	@Given("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password){
		lp.inputPassWord(password);
	   
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String control){
	   if(control.equals("login"))
	   {
		   lp.login();
	   }
	}

	@Then("^Dashboard page should be displayed$")
	public void dashboard_page_should_be_displayed(){
	    String dashboardPageTitle = lp.getTextOfDashboard();
	    sa.assertEquals("Dashboard", "Dashboard","Dashboard page title mismatch.");
	    sa.assertAll();
	}

	@Then("^User should be able to see an error message$")
	public void user_should_be_able_to_see_an_error_message(){
	   String invalidTextTile = "Invalid Username or Password";
	   sa.assertEquals("Invalid Username or Password", "Invalid Username or Password","Invalid user name text mismatch.");
	   sa.assertAll();
	}

	

}
