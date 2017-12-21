package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.HomePage;
import utils.Context;

public abstract class BaseStep
{
  protected WebDriver driver;
  protected HomePage homePage;
  protected Context context;

  public BaseStep(Context context)
  {
    System.out.println("Hola mundo!");
    this.context = context;
  }


  @Before
  public void InitializeTest()
  {
    driver = context.getDriver();
    driver.navigate().to("http://newtours.demoaut.com/");
  }


  @After
  public void TearDownTest()
  {
    driver.close();
    driver.quit();
  }
}
