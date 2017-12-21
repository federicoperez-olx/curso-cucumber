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


public class register {

	private Context context;
	private WebDriver driver;
	private RegisterPage registerPage;
	private HomePage homePage;

	public register(Context context) {
		System.out.println("--------------- dependency injection in register");
		this.context = context;
	}

	@Before
	public void InitializeTest() {
		System.out.println("--------------- dependency injection in initialize");
		driver = context.getDriver();
		driver.navigate().to("http://newtours.demoaut.com");

		homePage = new HomePage(driver);
		registerPage = new RegisterPage(driver);
	}

	@After
	public void TearDownTest() {
		System.out.println("--------------- dependency injection in teardown");
		//driver.close();
		driver.quit();
	}

	@Given("^User is in Homepage$")
	public void user_is_in_Homepage() {
		homePage.assertHomePage();
	}

	@Given("^User clicks register link$")
	public void user_clicks_register_link() {
		homePage.clickRegisterHere();
	}

	@Given("^User inputs First name \\\"([^\\\"]*)\\\"$")
	public void user_inputs_First_name(String fname) {
		registerPage.enterFirstName(fname);
	}

	@Given("^User inputs Last name \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Last_name(String lname) {
		registerPage.enterLastName(lname);
	}

	@Given("^User inputs Phone \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Phone(String phone) {
		registerPage.enterPhone(phone);
	}

	@Given("^User inputs Address1 \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Address(String address) {
		registerPage.enterAdress1(address);
	}

	@Given("^User inputs Address2 \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Address2(String address) {
		registerPage.enterAdress2(address);
	}

	@Given("^User inputs City \\\"([^\\\"]*)\\\"$")
	public void user_inputs_City(String city) {
		registerPage.enterCity(city);
	}

	@Given("^User inputs State \\\"([^\\\"]*)\\\"$")
	public void user_inputs_State(String state) {
		registerPage.enterState(state);
	}

	@Given("^User inputs Postal Code \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Postal_Code(String postalCode) {
		registerPage.enterPostalCode(postalCode);
	}

	@Given("^User selects Country \\\"([^\\\"]*)\\\"$")
	public void user_selects_Country(String country) {
		registerPage.selectCountryByVisibleText(country.toUpperCase());
	}

	@Given("^User inputs User \\\"([^\\\"]*)\\\"$")
	public void user_inputs_User(String user) {
		registerPage.enterUsername(user);
	}

	@Given("^User inputs Password \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Password(String pass) {
		registerPage.enterPassword(pass);
	}

	@Given("^User inputs Confirms Password \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Confirms_Password(String confirmPassword) {
		registerPage.enterConfirmPassword(confirmPassword);
	}

	@When("^User clicks Submit button$")
	public void user_clicks_Submit_button() {
		registerPage.clickRegister();
	}

	@Then("^Success shows up$")
	public void success_shows_up() {
		registerPage.assertSucessfulRegister();
	}

}
