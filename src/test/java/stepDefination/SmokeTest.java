package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class SmokeTest {
	WebDriver driver;
	
	@Given("I want to write a step with precondition")
	public void I___precondition() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.baidu.com");
		
	}

}
