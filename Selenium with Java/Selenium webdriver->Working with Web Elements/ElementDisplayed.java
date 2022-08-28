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

public class ElementDisplayed {

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
		
		WebElement textbox=driver.findElement(By.id("displayed-text"));
		textbox.sendKeys("Dipankar");		

		System.out.println("Text Box is displayed");
		Thread.sleep(3000);
		WebElement hideButton=driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Textbox is displayed: "+textbox.isDisplayed());
		Thread.sleep(3000);
		WebElement showButton=driver.findElement(By.id("show-textbox"));
		showButton.click();
		
		System.out.println("Clicked on show button");
		System.out.println("Textbox is displayed: "+textbox.isDisplayed());
		
		
		

	
	
	}
	
	
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
