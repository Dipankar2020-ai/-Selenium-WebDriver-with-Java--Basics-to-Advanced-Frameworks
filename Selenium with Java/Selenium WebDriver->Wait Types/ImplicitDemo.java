import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitDemo {
	WebDriver driver;
	String baseUrl="https://courses.letskodeit.com/practice";
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		   
		   driver.get(baseUrl);  
	}
	
	@Test
	public void test() {
	driver.findElement(By.xpath("//a[@href='/login']"))	.click();
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}


	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);	
				
				driver.quit();
		
		
		
	}

	
}
