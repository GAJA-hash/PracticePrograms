
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropDown{

	public static void main(String[] args) throws Exception {
		String Projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",Projectpath+"/library/chromedriver/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://beta.spicejet.com");
			
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
//		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
	
		//To know the number of radio buttons available
		System.out.println(driver.findElements(By.cssSelector("div[style='margin-right: 6px;']")).size());
		
	}
}