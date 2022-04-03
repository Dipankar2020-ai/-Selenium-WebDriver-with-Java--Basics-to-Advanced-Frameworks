import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandWebdriver {

	public static String browser="Chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.linkText("Downloads")).click();
		driver.close();
		

	}

