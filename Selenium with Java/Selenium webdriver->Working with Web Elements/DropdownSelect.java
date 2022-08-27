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

public class DropdownSelect {

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

		WebElement element=driver.findElement(By.id("carselect"));
		Select sel=new Select(element);
		Thread.sleep(2000);
		System.out.println("Select Benz by value");
		sel.selectByValue("benz");
		Thread.sleep(2000);
		System.out.println("select honda by index");
		sel.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println("select BMW by visible");
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		System.out.println("Print the List of all options");
		List<WebElement> options=sel.getOptions();
		int size=options.size();
		System.out.println("Size of dropdown list :"+size);

		
		for(int i=0;i<size;i++)
		{
			String optionName=options.get(i).getText();
			System.out.println(optionName);
		}
					

	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	
	
	}

}
