package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;


public class RegisterPage
{
	private WebDriver driver;
	private By logoImage = By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");

	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void verifyInPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElements(logoImage).size()>0);
	}


	/**
	 * Wrapper method to fill the registration form with one confortable method.
	 */
	public void FillRegistrationForm(String fname, String lname, String phone, String email, String address1, String address2, String city, String postalCode, String state, String country, String usrName, String psw) throws Exception
	{
		enterFirstName(fname);
		enterLastName(lname);
		enterPhone(phone);
		enterEmail(email);
		enterAdress1(address1);
		enterAdress2(address2);
		enterCity(city);
		enterState(state);
		enterPostalCode(postalCode);
		selectCountryByVisibleText(country);
		enterUsername(usrName);
		enterPassword(psw);
		enterConfirmPassword(psw);

		clickRegister();
	}

	public void enterFirstName (String firstName){
		WebElement textFirstName = driver.findElement(By.name("firstName"));
		textFirstName.clear();
		textFirstName.sendKeys(firstName);

	}

	public void enterLastName (String lastName){
		WebElement textLastName = driver.findElement(By.name("lastName"));
		textLastName.clear();
		textLastName.sendKeys(lastName);
	}

	public void enterPhone (String phone){
		WebElement textPhone = driver.findElement(By.name("phone"));
		textPhone.clear();
		textPhone.sendKeys(phone);
	}

	public void enterEmail (String email){
		WebElement textEmail = driver.findElement(By.id("userName"));
		textEmail.clear();
		textEmail.sendKeys(email);
	}


	public void enterAdress1 (String address1){
		WebElement textAdress1 = driver.findElement(By.name("address1"));
		textAdress1.clear();
		textAdress1.sendKeys(address1);
	}

	public void enterAdress2 (String address2){
		WebElement textAdress2 = driver.findElement(By.name("address1"));
		textAdress2.clear();
		textAdress2.sendKeys(address2);
	}

	public void enterCity  (String city){
		WebElement textCity = driver.findElement(By.name("city"));
		textCity .clear();
		textCity .sendKeys(city);
	}

	public void enterState (String state){
		WebElement textState = driver.findElement(By.name("state"));
		textState.clear();
		textState.sendKeys(state);
	}

	public void enterPostalCode (String postalCode){
		WebElement textPostalCode = driver.findElement(By.name("postalCode"));
		textPostalCode.clear();
		textPostalCode.sendKeys(postalCode);
	}

	public void selectCountryByVisibleText (String country)
	{
		Select selectCountry = new Select( driver.findElement(By.name("country")) );
		selectCountry.selectByVisibleText( country.toUpperCase() );
	}

	public void selectCountryByValue (String country){
		Select selectCountry = new Select( driver.findElement(By.name("country")) );
		selectCountry.selectByValue( country.toUpperCase() );
	}

	public void enterUsername (String userName){
		WebElement textUsername = driver.findElement(By.id("email"));
		textUsername.clear();
		textUsername.sendKeys(userName);
	}

	public void enterPassword (String psw){
		WebElement textPassword = driver.findElement(By.name("password"));
		textPassword.clear();
		textPassword.sendKeys(psw);
	}

	public void enterConfirmPassword (String psw){
		WebElement textConfirmPassword = driver.findElement(By.name("confirmPassword"));
		textConfirmPassword.clear();
		textConfirmPassword.sendKeys(psw);
	}

	public void clickRegister (){
		driver.findElement(By.name("register")).click();
	}

	public void assertSucessfulRegister()
	{
		String success_url = "http://newtours.demoaut.com/create_account_success.php";

		WebDriverWait ww = new WebDriverWait(driver, 5);
		ww.until(ExpectedConditions.urlToBe(success_url));

		assert driver.getCurrentUrl().equals( success_url );
	}
}
