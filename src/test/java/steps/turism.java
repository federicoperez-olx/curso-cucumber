package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import utils.Context;

public class turism {
	private WebDriver driver;

	private HomePage homePage;
	private Context context;

	public turism(Context context) {
		System.out.println("dependency injection in homepage");
		this.context = context;
	}

	@Before
	public void InitializeTest() {

		driver = context.getDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		homePage = new HomePage(driver);
	}

	@After
	public void TearDownTest() {
		//driver.close();
		driver.quit();
	}

	@Given("^I enter a username (.*)")
	public void I_enter_a_username(String user) {
		homePage.enterUser(user);
	}

	@Given("^I enter a password (.*)")
	public void I_enter_a_password(String pass) {
		homePage.enterPassword(pass);
	}

	@When("^I click  Sign-In button")
	public void I_click_sign_in_button() {
		homePage.clickButtonSignIn();
	}

	@Then("^login result must be (.*)")
	public void login_results_must_be(String result) {

		RegisterPage RegisterPage = new RegisterPage(driver);
		RegisterPage.verifyInPage();
	}

}
