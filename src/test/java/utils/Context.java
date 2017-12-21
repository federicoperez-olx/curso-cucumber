package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Context
{
	private WebDriver driver;
	public Context()
	{
		//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
	  this.driver = new ChromeDriver();
	}

	public WebDriver getDriver()
	{
		return driver;
	}
}
