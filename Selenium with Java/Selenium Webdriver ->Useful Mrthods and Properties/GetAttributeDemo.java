import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	WebDriver driver;
	String baseUrl="https://courses.letskodeit.com/practice";
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.get(baseUrl);
	}

	

	@Test
	public void test() {
		
		WebElement element=driver.findElement(By.id("displayed-text"));
		String attributevalue=element.getAttribute("placeholder")	;	
		
		String attributevalue1=element.getAttribute("type")	;	
		System.out.println("Value of attribute is : "+attributevalue);
		System.out.println("Value of attribute is : "+attributevalue1);
				
				
				
				
				
				
				
				
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
