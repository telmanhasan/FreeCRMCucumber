//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_already_on_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://ui.freecrm.com/");
//		
//	}
//	@When ("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//	
//	// Cucumber regular expressions
//	//1.\"(.*)\"
//	//2.\"([^\"]*\
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password)  {
//	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
//	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	   
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//		driver.findElement(By.cssSelector(".ui.fluid.large")).click();
//	}
//	
//	
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()  {
//	    
//	}
//	
//	@Then("^user moves to contact page$")
//	public void user_moves_to_contact_page() throws InterruptedException  {
//		Thread.sleep(2000);
//	   driver.findElement(By.linkText("Contacts")).click();
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details(String firtsname, String lastname,String position) {
//		driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
//		driver.findElement(By.name("first_name")).sendKeys(firtsname);
//		driver.findElement(By.name("last_name")).sendKeys(lastname);
//		driver.findElement(By.name("position")).sendKeys(position);
//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() throws InterruptedException {
//		Thread.sleep(2000);
////		driver.quit();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//}
