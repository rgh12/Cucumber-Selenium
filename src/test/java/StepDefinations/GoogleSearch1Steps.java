package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch1Steps {
	
	WebDriver driver=null;
	
	@Given("broswer is open")
	public void broswer_is_open() {
	   
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    
		driver.navigate().to("https://www.google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    
		driver.findElement(By.name("q")).sendKeys("cute baby pics");
	}

	@And("hits enter")
	public void hits_enter() {
	   
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    
		driver.getPageSource().contains("People also search for");
		
		driver.close();
		driver.quit();
		
	}


}
