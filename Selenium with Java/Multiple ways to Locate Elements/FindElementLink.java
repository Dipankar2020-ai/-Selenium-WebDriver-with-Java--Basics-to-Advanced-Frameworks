import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://letskodeit.teachable.com/");
		 driver.findElement(By.linkText("Login")).click();
		 
		 Thread.sleep(3000);
		 driver.navigate().to("https://letskodeit.teachable.com/");
		 driver.findElement(By.partialLinkText("Prac")).click();
		 driver.findElement(By.xpath("//a[@href='https://courses.letskodeit.com/practice']")).click();
	}
}