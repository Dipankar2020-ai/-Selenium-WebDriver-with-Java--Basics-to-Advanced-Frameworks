import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://letskodeit.teachable.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page is"+title);
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current Url is"+currenturl);
		String Urltonavigate="https://sso.teachable.com/secure/42299/users/sign_in?reset_purchase_session=1";
		driver.navigate().to(Urltonavigate);
		System.out.println("Navigating to Login");
		currenturl=driver.getCurrentUrl();
		System.out.println("Current Url is"+currenturl);
		Thread.sleep(200);
		driver.navigate().back();
		System.out.println("Navigate Back");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		Thread.sleep(200);
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh");
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		
		
		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}



}
