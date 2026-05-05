package AutoProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo1 {
    
	@Test
	public void actiondemo1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		//action.doubleClick(driver.findElement(By.id("nav-logo-sprites"))).build().perform();
		//action.contextClick(driver.findElement(By.id("nav-logo-sprites"))).build().perform();
		action.click(driver.findElement(By.xpath("//a/span[text()='Baby Wishlist']"))).build().perform();
		
		
	}
}
