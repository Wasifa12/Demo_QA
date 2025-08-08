package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;


public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
        super(driver);
    }
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	//logo
		 public By logo = By.xpath("//h2[text()='Test login']");
		 
	//  username
		 
		 public By username_Xpath = By.xpath("//input[@id='username']");
		 
	//password
		 public By password_Xpath = By.xpath("//input[@id='password']");
		 
	//submit button
		 public By submitbutton = By.xpath("//button[text()='Submit']");
		 
	//login page redirection
		 public By loginpage_redirection = By.xpath("//h1[text()='Logged In Successfully']");
		 
		 public By errormessage = By.id("error");
		 
		 
		 public By errormessage_invalidusername = By.id("error");

		 
		
		public void checkLogo()
		{
			boolean isDisplayed= driver.findElement(logo).isDisplayed();
			if(isDisplayed)
			{
				System.out.println("In Homepage");
			}  
		}
		
		public void enterUserName(String userName) {
			
			driver.findElement(username_Xpath).clear();
			
			System.out.println("Enter the Username: "+userName);
			driver.findElement(username_Xpath).sendKeys(userName);
			
		}
		
		public void enterpassWord(String passWord){
		
			
			System.out.println("Enter the Password:" +passWord);
			driver.findElement(password_Xpath).sendKeys(passWord);
			
			
			
		
		}
		
		public void clicksubmitoption() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			driver.findElement(submitbutton).click();
		
			
		}
		
		 public String checkExpectedResult() {
		        try {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
		            return driver.findElement(errormessage).getText();
		        } catch (Exception e) {
		            return driver.findElement(loginpage_redirection).getText();
		        }
		    }

		
		
		
		
		
		@After
		public void tearDown() {
		    if (driver != null) {
		        driver.quit();
		    }
		}

}
