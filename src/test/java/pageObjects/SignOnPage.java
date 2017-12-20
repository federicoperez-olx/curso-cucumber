package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignOnPage {
	private WebDriver driver;
	private By logoImage = By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
	public SignOnPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void verifyInPage() {
		Assert.assertTrue(driver.findElements(logoImage).size()>0);
	}
	
}
