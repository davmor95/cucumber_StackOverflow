package cucumberframework.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {
	
	
	  WebDriver driver;
	  
	  @Before() public void setup() throws IOException {
	
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe"); 
		  this.driver = new FirefoxDriver(); 
		  }
	  
	  @Given("^User navigates to stackoverflow website$") public void
	  user_navigates_to_stackoveflow_website() throws Throwable {
		  this.driver.get("http://stackoverflow.com/"); 
	  }
	  
	  @Given("^User clicks on Log in button$") public void
	  user_clicks_on_Log_in_button() throws Throwable {
	  driver.findElement(By.xpath("//a[contains(text(), 'Log in')]")).click();
	  }
	  
	  @Given("^User enters a valid username$") public void
	  user_enters_a_valid_username() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("webdriveruniversity2@mail.com"); }
	  
	  @Given("^User enters a valid password$") public void
	  user_enters_a_valid_password() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Yellow321!"); }
	  
	  @When("^User clicks on the Submit button$") public void
	  user_clicks_on_the_Submit_button() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='submit-button']")).click(); }
	  
	  @Then("^User is taken to login page successfully$") public void
	  user_is_taken_to_login_page_successfully() throws Throwable { WebElement
	  askQuestionsButton =
	  driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
	  Assert.assertEquals(true, askQuestionsButton.isDisplayed()); driver.close();
	  }
	  
	  
	 	
// For login feature 2
	@Given("^User navigates to stackoverflow website2$")
	public void user_navigates_to_stackoveflow_website2() throws Throwable {
		System.out.println("user_navigates_to_stackoveflow_website2");
	}

	@Given("^User clicks on Log in button2$")
	public void user_clicks_on_Log_in_button2() throws Throwable {
		System.out.println("user_clicks_on_Log_in_button2");
	}

	@Given("^User enters a valid username2$")
	public void user_enters_a_valid_username2() throws Throwable {
		System.out.println("user_enters_a_valid_username2");
	}

	@Given("^User enters a valid password2$")
	public void user_enters_a_valid_password2() throws Throwable {
		System.out.println("user_enters_a_valid_password2");
	}

	@When("^User clicks on the Submit button2$")
	public void user_clicks_on_the_Submit_button2() throws Throwable {
		System.out.println("user_clicks_on_the_Submit_button2");
	}

	@Then("^User is taken to login page successfully2$")
	public void user_is_taken_to_login_page_successfully2() throws Throwable {
	System.out.println("user_is_taken_to_login_page_successfully2");
	//driver.close();
	}
}
