import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook{

	public static void main(String[] args) {
		String Projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",Projectpath+"/library/chromedriver/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}