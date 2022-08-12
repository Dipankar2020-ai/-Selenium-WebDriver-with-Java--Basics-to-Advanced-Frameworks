import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");		
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");		
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			driver.close();
	}
}