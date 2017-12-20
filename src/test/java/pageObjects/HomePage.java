package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	
	private WebDriver driver;
	//private Waiter waiter;
	private By userField = By.name("userName");
	private By passwordField = By.name("password");
	private By submitButton = By.name("login");
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		//waiter = new Waiter(driver);
	}
	
	public void enterUserName(String username) {
		this.driver.findElement(userField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		this.driver.findElement(passwordField).sendKeys(password);
	}
	
	public void submitButton() {
		this.driver.findElement(submitButton).click();
	}
	
	
	
}
