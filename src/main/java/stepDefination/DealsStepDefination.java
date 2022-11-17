package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DealsStepDefination {


	WebDriver driver;

	@Given("^user is already onn Login Page$")
	public void user_is_already_on_Login_Page()  {
		System.setProperty("webdriver.chrome.driver", "/Users/sai/Downloads/SeleniumJars/Chrome107//chromedriver");
		driver = new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@When("^title of login page iss Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}

	@Then("^user enters username and password$")
	public void user_enters_and(DataTable credentials) {
		List<List<String>> Data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(Data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(Data.get(0).get(1));


	}

	@Then("^user click on login button$")
	public void user_clicks_on_login_button() {
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

	}

	@Then("^user is on new home page$")
	public void user_is_on_home_page()  {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("CRMPRO", title);

	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData)  {
		List<List<String>>dealValues = dealData.raw();
		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		
	}


	@Then("^Closed the browser$")
	public void close_the_browser()  {
		driver.quit();

	}
}