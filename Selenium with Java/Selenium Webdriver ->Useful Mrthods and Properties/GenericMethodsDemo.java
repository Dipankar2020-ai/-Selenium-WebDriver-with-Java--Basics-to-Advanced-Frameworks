import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethodsDemo {

	WebDriver driver;
	String baseUrl="https://courses.letskodeit.com/practice";
	private GenericMethods gm;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   
		   gm=new GenericMethods(driver);				   
				   
				   
				   
				   
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.get(baseUrl);
	}

	

	@Test
	public void test() {
		
		
		WebElement element=gm.getElement("name", "id");
		element.sendKeys("test");
		
		
		
	}
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
