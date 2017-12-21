package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;

public class SignOnPage 
{
	private WebDriver driver;
	private By logoImage = By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");

	public SignOnPage(WebDriver driver) 
	{
		
		this.driver = driver;
		
	}
	
	public void verifyInPage() {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		WebElement textFirstName = this.driver.findElement(By.name("firstName"));
		textFirstName.clear();
		textFirstName.sendKeys(firstName);
		
	}

	public void enterLastName (String lastName){
		WebElement textLastName = this.driver.findElement(By.name("lastName"));
		textLastName.clear();
		textLastName.sendKeys(lastName);
	}
	
	public void enterPhone (String phone){
		WebElement textPhone = this.driver.findElement(By.name("phone"));
		textPhone.clear();
		textPhone.sendKeys(phone);
	}
	
	public void enterEmail (String email){
		WebElement textEmail = this.driver.findElement(By.id("userName"));
		textEmail.clear();
		textEmail.sendKeys(email);
	}

	
	public void enterAdress1 (String address1){
		WebElement textAdress1 = this.driver.findElement(By.name("address1"));
		textAdress1.clear();
		textAdress1.sendKeys(address1);
	}
	
	public void enterAdress2 (String address2){
		WebElement textAdress2 = this.driver.findElement(By.name("address1"));
		textAdress2.clear();
		textAdress2.sendKeys(address2);
	}
	
	public void enterCity  (String city){
		WebElement textCity = this.driver.findElement(By.name("city"));
		textCity .clear();
		textCity .sendKeys(city);
	}
	
	public void enterState (String state){
		WebElement textState = this.driver.findElement(By.name("state"));
		textState.clear();
		textState.sendKeys(state);
	}
	
	public void enterPostalCode (String postalCode){
		WebElement textPostalCode = this.driver.findElement(By.name("postalCode"));
		textPostalCode.clear();
		textPostalCode.sendKeys(postalCode);
	}

	public void selectCountryByVisibleText (String country)
	{
		Select selectCountry = new Select( this.driver.findElement(By.name("country")) );
		selectCountry.selectByVisibleText( country.toUpperCase() );
	}

	public void selectCountryByValue (String country){
		Select selectCountry = new Select( this.driver.findElement(By.name("country")) );
		selectCountry.selectByValue( country.toUpperCase() );
	}	
	
	public void enterUsername (String userName){
		WebElement textUsername = this.driver.findElement(By.id("email"));
		textUsername.clear();
		textUsername.sendKeys(userName);
	}
	
	public void enterPassword (String psw){
		WebElement textPassword = this.driver.findElement(By.name("password"));
		textPassword.clear();
		textPassword.sendKeys(psw);
	}
	
	public void enterConfirmPassword (String psw){
		WebElement textConfirmPassword = this.driver.findElement(By.name("confirmPassword"));
		textConfirmPassword.clear();
		textConfirmPassword.sendKeys(psw);
	}
	
	public void clickRegister (){
		this.driver.findElement(By.name("register")).click();
	}
	
}
