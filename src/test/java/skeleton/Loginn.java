package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginn {

	
	WebDriver driver;

	String login;
	String password;
	
	
@Given("user is on the login page")
public void user_is_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	
	
	
	
	System.setProperty("webdriver.chrome.driver","C:\\ROBIN\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/");
    driver.findElement(By.linkText("Log in")).click();
    
}

@When("user provides the correct credentials {string} and {string}")
public void user_provides_the_correct_credentials(String login,String password) {
   
	
	driver.findElement(By.id("Email")).sendKeys(login);
	
	driver.findElement(By.id("Password")).sendKeys(password);

	  driver.findElement(By.cssSelector("input[value='Log in']")).click();
	 
   
}

@Then("user rendered to TestMeApp home page")
public void user_rendered_to_TestMeApp_home_page() {

	
	
	  String y=driver.getTitle();
	 
	  if(y.equalsIgnoreCase("Demo Web Shop"))
	  {
		  System.out.println("passsed");
	  }
	  else
	  {
		  
	  
	System.out.println("failed");
	  }

	  
	 

driver.findElement(By.linkText("Log out")).click();
driver.close();
}

	
	
	
	
}
