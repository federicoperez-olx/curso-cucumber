package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.SignOnPage;
import utils.Context;

public class register {

	private Context context;
	private WebDriver driver;
	private SignOnPage signOnPage;
	private HomePage homePage;

	public register(Context context) {
		System.out.println("--------------- dependency injection in register");
		this.context = context;
	}

	@Before
	public void InitializeTest() {
		System.out.println("--------------- dependency injection in initialize");
		driver = context.getDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		homePage = new HomePage(driver);
		signOnPage = new SignOnPage(driver);
	}

	@After
	public void TearDownTest() {
		System.out.println("--------------- dependency injection in teardown");
		driver.close();
	}

	@Given("^User is in Homepage$")
	public void user_is_in_Homepage() {

	}

	@Given("^User clicks register link$")
	public void user_clicks_register_link() {
		homePage.clickRegisterHere();
	}

	@Given("^User inputs First name \\\"([^\\\"]*)\\\"$")
	public void user_inputs_First_name(String fname) {
		signOnPage.enterFirstName(fname);
	}

	@Given("^User inputs Last name \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Last_name(String lname) {
		signOnPage.enterLastName(lname);
	}

	@Given("^User inputs Phone \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Phone(String phone) {
		signOnPage.enterPhone(phone);
	}

	@Given("^User inputs Address1 \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Address(String address) {
		signOnPage.enterAdress1(address);
	}

	@Given("^User inputs Address2 \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Address2(String address) {
		signOnPage.enterAdress2(address);
	}

	@Given("^User inputs City \\\"([^\\\"]*)\\\"$")
	public void user_inputs_City(String city) {
		signOnPage.enterCity(city);
	}

	@Given("^User inputs State \\\"([^\\\"]*)\\\"$")
	public void user_inputs_State(String state) {
		signOnPage.enterState(state);
	}

	@Given("^User inputs Postal Code \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Postal_Code(String postalCode) {
		signOnPage.enterPostalCode(postalCode);
	}

	@Given("^User selects Country \\\"([^\\\"]*)\\\"$")
	public void user_selects_Country(String country) {
		signOnPage.selectCountryByVisibleText(country.toUpperCase());
	}

	@Given("^User inputs User \\\"([^\\\"]*)\\\"$")
	public void user_inputs_User(String user) {
		signOnPage.enterUsername(user);
	}

	@Given("^User inputs Password \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Password(String pass) {
		signOnPage.enterPassword(pass);
	}

	@Given("^User inputs Confirms Password \\\"([^\\\"]*)\\\"$")
	public void user_inputs_Confirms_Password(String confirmPassword) {
		signOnPage.enterConfirmPassword(confirmPassword);
	}

	@When("^User clicks Submit button$")
	public void user_clicks_Submit_button() {
		signOnPage.clickRegister();
	}

	@Then("^success shows up$")
	public void success_shows_up() {

	}

}
