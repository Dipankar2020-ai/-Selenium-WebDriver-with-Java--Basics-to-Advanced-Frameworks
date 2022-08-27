import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class ListOfElements {

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
		 
		 boolean isChecked = false;
		 List<WebElement> radioButtons = driver.findElements(
					By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		 int size=radioButtons.size();
		 
		 for(int i=0;i<size;i++)
		 {
			 isChecked=radioButtons.get(i).isSelected();
			 if(!isChecked)
			 {
				 
				 radioButtons.get(i).click();
				 Thread.sleep(2000);				 
				 
				 
			 }
		 }	
		
	}
	@After
	public void tearDown() throws Exception {
		
		driver.quit();
		
	}
}