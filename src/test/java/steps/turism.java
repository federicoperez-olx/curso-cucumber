package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.SignOnPage;
import utils.Context;

public class turism extends BaseStep
{
	private HomePage homePage;
	
	public turism(Context context) {
		super(context);
	}

  @Before
  public void InitializeTest()
  {
    super.InitializeTest();
	homePage = new HomePage(driver);
  }

  @Override
  @After
  public void TearDownTest()
  {
    super.TearDownTest();
  }

  @Given("^I enter a username (.*)")
  public void I_enter_a_username(String user)
  {
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

	  SignOnPage signOnPage = new SignOnPage(driver);
	  signOnPage.verifyInPage();
  }


}
