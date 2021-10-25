import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {
	public static void main(String[] args) {
		String Projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath + "/library/chromedriver94.0/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		//		calendar
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"))
		.click();
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[7]/div[1]/div[1]"))
		.click();
		WebElement adult = driver.findElement(By.xpath("//div[@class='mb-4']/select"));
		//		WebElement adult=driver.findElement(By.xpath("//h4[@class='fs-3 fw-600 c-neutral-900 mb-2']"));
		Select s = new Select(adult);
		s.selectByIndex(2);
		WebElement ch = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/select[1]"));
		//		WebElement ch=driver.findElement(By.xpath("//h4[@class='fs-3 fw-400 c-neutral-900 mb-2']"));
		Select s1 = new Select(ch);
		s1.selectByIndex(2);
		driver.findElement(By.xpath("//strong[@class='pr-1']")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"))
		.sendKeys("indigo");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/button[1]"))
		.click();
		//		//validate error message
		System.out.println(
				driver.findElement(By.xpath("//span[contains(text(),'Select Departure and Arrival airports/cities.')]"))
				.getText());
	}
}