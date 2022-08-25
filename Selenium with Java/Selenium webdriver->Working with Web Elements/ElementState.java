import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementState {
	
	 WebDriver driver;
	String baseUrl="https://www.google.com/";

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
		WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		element.sendKeys("Dipankar");		
		System.out.println("Is element enabled?"+element.isEnabled());
		
		
		
		
		
		
		
		
		
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
