package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DealsStepWithMapDefinition {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
		}
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector(".ui.fluid.large")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {

	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Deals")).click();

		driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
	}

	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {
		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
			driver.findElement(By.name("title")).sendKeys(data.get("title"));
			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.name("commission")).sendKeys(data.get("commisiion"));
		}

	}

	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
