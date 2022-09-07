import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	WebDriver driver;
	String baseUrl="https://courses.letskodeit.com/practice";
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   
		   driver.get(baseUrl);  
	}

	@Test
	public void test() {

		
	driver.findElement(By.xpath("//a[@href='/login']"))	.click();
	
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));	
	
	
	WebElement emailField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))	);
	

	emailField.sendKeys("abc@gmail.com");
	}


	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);	
				
				driver.quit();
		
		
		
	}

}
