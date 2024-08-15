package StepsForHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	
	WebDriver driver=null;
	
	@Before
	public void browserSetup()
	{
		System.out.println("  i am in browser setup   ");
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	}
	
	@After
	public void tearDown()
	{
		System.out.println(" i am inside after scenario");
		driver.close();
		driver.quit();
	}
	/*
	@BeforeStep
	public void beforeStep()
	{
		System.out.println(" *********************** ");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&&&& ");
	}
	*/
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user logged in");
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		 System.out.println("userd entered username and password");
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		 System.out.println("user  clicked on logged button");
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 System.out.println("user navigated");
	}




}
