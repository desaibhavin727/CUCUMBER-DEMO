package stepDefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

///data table with maps : for parameterization of test cases

public class DealsStepWithMapDefination {

	WebDriver driver;

	@Given("^user iss already on Login Page$")
	public void user_is_already_on_Login_Page()  {
		System.setProperty("webdriver.chrome.driver", "/Users/sai/Downloads/SeleniumJars/Chrome107//chromedriver");
		driver = new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@When("^title off login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}

	@Then("^user enterss username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

		}
	}


	@Then("^user clickss on login button$")
	public void user_clicks_on_login_button() {
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

	}

	@Then("^user is onn home page$")
	public void user_is_on_home_page()  {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("CRMPRO", title);

	}

	@Then("^user movess to new deal page$")
	public void user_moves_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}

	@Then("^user enters deals details$")
	public void user_enters_contacts_details(DataTable dealData) {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));

			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

	}


	@Then("^Closse the browser$")
	public void close_the_browser()  {
		driver.quit();

	}
}
