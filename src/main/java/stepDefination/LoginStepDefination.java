package stepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	WebDriver driver;
	
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page()  {
		System.setProperty("webdriver.chrome.driver", "/Users/sai/Downloads/SeleniumJars/Chrome107//chromedriver");
		driver = new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {

		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	
	
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO", title);
	
	}
	
	@Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
		}
	
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	 }

	@Then("^Close the browser$")
	public void close_the_browser()  {
		driver.quit();
	
	}


	
	
	
	
	
}
