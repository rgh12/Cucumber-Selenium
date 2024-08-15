package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1DemoSteps {
	
	WebDriver driver=null;
	
	@Given("browser1 is open")
	public void browser1_is_open() {
	    
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user on login page")
	public void user_on_login_page() {
	    
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enter (.*) and (.*)$")// regular expressions
	public void user_enter_username_and_password(String username, String password) {
	    
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	   
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user navigates to Home page")
	public void user_navigates_to_home_page() {
	   
		driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		
		driver.close();
		driver.quit();
	}

}
