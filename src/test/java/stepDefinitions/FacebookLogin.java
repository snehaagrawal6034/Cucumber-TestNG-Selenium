package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FacebookLogin {
	public static String status = "failed";
	private WebDriver driver;


	@Given("^user is in facebook login page$")
	public void user_already_on_login_page() throws Exception {
		driver = TestRunner.getDriver();
		driver.get("https://facebook.com");
	}

	@When("^user enters correct \"([^\\\"]*)\" address")
	public void user_emailid(String emailid) {
		driver.findElement(By.id("email")).sendKeys(emailid);
	}

	@When("^user enter correct \"([^\"]*)\"$")
	public void user_enter_correct(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("^user click on login button")
	public void user_clickButton() {
		driver.findElement(By.name("login")).click();
	}

	@Then ("user should successfully login to facebook")
	public void user_should_successfully_login_to_facebook() {
		System.out.println("user successfully login to facebook page");
	}
}
