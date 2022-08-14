import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://letskodeit.teachable.com/");
		 driver.findElement(By.xpath("//a[@href='/sign_in']")).click(); 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sudipkundu204@gmail.com");
		 driver.navigate().back();
		 driver.close();
		 
		 }

}
