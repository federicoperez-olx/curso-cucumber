package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String expectedTitle()
	{
		return "Welcome: Mercury Tours";
	}

	public void enterUser(String userName)
	{
		WebElement textUsername = driver.findElement(By.name("userName"));
		textUsername.clear();
		textUsername.sendKeys(userName);
	}

	public void enterPassword(String psw)
	{
		WebElement textPassword = driver.findElement(By.name("password"));
		textPassword.clear();
		textPassword.sendKeys(psw);
	}

	public void clickButtonSignIn()
	{
		driver.findElement(By.name("login")).click();
	}

	public void SignIn(String usr, String psw)
	{
		enterUser(usr);
		enterPassword(psw);

		clickButtonSignIn();
	}


	public void clickYourDestination(){
		driver.findElement(By.linkText("your destination")).click();
	}

	public void clickFeaturedDestinations(){
		driver.findElement(By.linkText("featured vacation destinations")).click();
	}

	public void clickRegisterHere(){
		driver.findElement(By.partialLinkText("Register")).click();
	}

	public void clickBusiness(){
		driver.findElement(By.partialLinkText("@ About.com")).click();
	}

	public void clickSalonTravel(){
		driver.findElement(By.linkText("Salon Travel")).click();
	}

	public void assertHomePage()
	{
		assert expectedTitle() == driver.getTitle();
	}
	
}
