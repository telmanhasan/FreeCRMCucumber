import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testfreecrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("telmanhasanov@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Bileceri86");
		driver.findElement(By.cssSelector(".ui.fluid.large ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Deals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
		
	

	}

}
