import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIPANKAR\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
