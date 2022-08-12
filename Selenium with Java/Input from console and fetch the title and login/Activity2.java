import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;



public class loginTest {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=sc.nextLine();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		 if(browser.equals("chrome"))
		 {
			 WebDriver driver=new ChromeDriver();
			 
			driver.get("https://www.saucedemo.com/");
			System.out.println(driver.getTitle());
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");		
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			driver.close();
		 }
		 
		 
				
			
	}
}
