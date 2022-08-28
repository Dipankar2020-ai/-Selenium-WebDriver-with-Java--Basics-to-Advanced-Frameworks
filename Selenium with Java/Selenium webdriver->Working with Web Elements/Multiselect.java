import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Multiselect {

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
	public void test() throws InterruptedException {
		
		WebElement element=driver.findElement(By.id("multiple-select-example"));
		Select sel=new Select(element);
		sel.selectByValue("orange");
		Thread.sleep(2000);
		System.out.println("Deselect by orange by value");
		sel.deselectByValue("orange");
		Thread.sleep(2000);
		System.out.println("Select peach by index");
		sel.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println("select by visible Text");
		sel.selectByVisibleText("Apple");
		Thread.sleep(2000);
		System.out.println("Print all selected options");
		Thread.sleep(2000);
		List<WebElement> selectedoptions=sel.getAllSelectedOptions();
		for(WebElement option:selectedoptions)
		{
			System.out.println(option.getText());
					
		}
				
		Thread.sleep(2000);
		System.out.println("Deselect all selected options");	
		
		sel.deselectAll();
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
