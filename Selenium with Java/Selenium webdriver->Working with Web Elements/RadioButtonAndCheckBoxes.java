import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBoxes {
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
		
		WebElement bmwradiobutton=driver.findElement(By.id("bmwradio"));
		bmwradiobutton.click();
		Thread.sleep(2000);
		WebElement benzradiobutton=driver.findElement(By.id("benzradio"));
		benzradiobutton.click();
		Thread.sleep(2000);
		WebElement hondaradiobutton=driver.findElement(By.id("hondaradio"));
		hondaradiobutton.click();
		Thread.sleep(2000);
		WebElement bmwcheckbutton=driver.findElement(By.id("bmwcheck"));
		bmwcheckbutton.click();
		Thread.sleep(2000);
		WebElement benzcheckbutton=driver.findElement(By.id("benzcheck"));
		benzcheckbutton.click();
		Thread.sleep(2000);
		System.out.println("BMW radio button is seleted?"+bmwradiobutton.isSelected());
		System.out.println("Benz radio button is seleted?"+benzradiobutton.isSelected());
		System.out.println("Honda radio button is seleted?"+hondaradiobutton.isSelected());
		System.out.println("BMW check button is seleted?"+	bmwcheckbutton.isSelected());
		System.out.println("BMW check button is seleted?"+	benzcheckbutton.isSelected());
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
