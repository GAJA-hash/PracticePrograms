import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1{

	public static void main(String[] args) throws Exception {
		String Projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",Projectpath+"/library/chromedriver94.0/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.println("The checkbox count is "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}