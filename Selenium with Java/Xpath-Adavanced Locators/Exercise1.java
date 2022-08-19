import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\Compressed\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://letskodeit.teachable.com/");
		 driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		 driver.findElement(By.xpath("//a[@href='https://courses.letskodeit.com/practice']")).click();
		 driver.findElement(By.xpath("//a[@href='/courses']")).click();
		
		String ans=driver.findElement(By.xpath("//span[@class='currency']")).getText();	
		driver.close();	 
		System.out.println(ans);
	
		 
		 
	}

}
