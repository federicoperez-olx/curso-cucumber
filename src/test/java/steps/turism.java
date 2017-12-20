package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.SignOnPage;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

public class turism {
  private WebDriver	driver;
  private HomePage homePage; 
  @Before
  public void InitializeTest() {
	  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://newtours.demoaut.com/");
	  homePage= new HomePage(driver);
  }
  
  
  @After
  public void TearDownTest() {
	  driver.close();
	  driver.quit();
  }
  
  @Given("^I enter a username (.*)")
  public void I_enter_a_username(String user) 
  {
	  homePage.enterUserName(user);
  }

  @Given("^I enter a password (.*)")
  public void I_enter_a_password(String pass) {
	  homePage.enterPassword(pass);
  }
  
  @When("^I click  Sign-In button")
  public void I_click_sign_in_button() {
	  homePage.submitButton();
  }
  
  @Then("^login result must be (.*)")
  public void login_results_must_be(String result) {
	  SignOnPage signOnPage = new SignOnPage(driver);
	  signOnPage.verifyInPage();
  }
 

}
