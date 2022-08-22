import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {
	 WebDriver driver;

	@Before
	public void setUp() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void test() {
			driver.get("https://letskodeit.teachable.com/");
			driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
			System.out.println("Clicked on login");
			driver.findElement(By.id("email")).sendKeys("test@email.com");
			System.out.println("Sending keys to username field");
			driver.findElement(By.id("password")).sendKeys("test");
			System.out.println("Sending keys to password field");
			driver.findElement(By.id("email")).clear();
			System.out.println("Clearing the username field");
			
			
			
			
			
	}		
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}