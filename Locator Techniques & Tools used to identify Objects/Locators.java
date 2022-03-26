import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/with_email");
		driver.findElement(By.id("user_name")).sendKeys("Dipankar Kundu");
		driver.findElement(By.id("user_email")).sendKeys("abc123");
		driver.findElement(By.id("password")).sendKeys("Dip12");
		driver.findElement(By.name("commit")).click();
		
		
	}

}
