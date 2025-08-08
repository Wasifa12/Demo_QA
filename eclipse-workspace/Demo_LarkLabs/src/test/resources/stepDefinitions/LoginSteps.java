package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
	
	
	    WebDriver driver;
	    LoginPage loginPage;
	  
	   

	    @Before
	    public void setUp() {
	        driver = DriverFactory.getDriver();
	    }
	   
	    @Given("the user is on the login page")
	    public void openHomePage() {
	        driver.get("https://practicetestautomation.com/practice-test-login/");
	        loginPage = new LoginPage(driver);
	        loginPage.checkLogo();
	      }
	    
	    @When("enter {string} in the username field")
	    public void enter_value_in_usernameplaceholder(String username) {
	        loginPage.enterUserName(username);
	    }
	    
	    @And("enter {string} in the password field")
	    public void enter_value_in_password_placeholder(String password) {
	        loginPage.enterpassWord(password);
	    }
	    
	    
	 
	    
	    @And("click the submit button")
	    public void submitbutton() {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        loginPage.clicksubmitoption();
	    }
	    
	    @Then("should see {string}")
	    public void see_the_expected_message(String expectedResult) {
	    	 String actualResult = loginPage.checkExpectedResult();
	         Assert.assertEquals(expectedResult, actualResult);
	    }
	    
	    
	   
	    
	   	     
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

}
