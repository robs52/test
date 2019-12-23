package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumberr {

	WebDriver Driver;
	
	
	@Given("User is on the test me app home page")
	public void user_is_on_the_test_me_app_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //throw new cucumber.api.PendingException();
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\ROBIN\\chromedriver_win32\\chromedriver.exe");
		Driver= new ChromeDriver();
		  		Driver.get("http://10.232.237.143:443/TestMeApp/");
		  
		  		
		
	}

	@When("the user gives valid login")
	public void the_user_gives_valid_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		Driver.findElement(By.linkText("SignIn")).click();
		 Driver.findElement(By.id("userName")).sendKeys("Lalitha");
		 Driver.findElement(By.id("password")).sendKeys("Password123");
		 Driver.findElement(By.name("Login")).click();
		 Thread.sleep(2000);
		 
		 
		 
		  
		
		
		
	}

	@When("valid password")
	public void valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		
		
		
		
		
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	
	
	
}
