package AutoProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class alerts {
	
	@Test
	public void alertdemo() {
		WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://demoqa.com/alerts");
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     WebElement scroll = driver.findElement(By.xpath("//div/h1[text()='Alerts']"));
	     js.executeScript("arguments[0].scrollIntoView()",scroll);
	     
	     //driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	     //driver.switchTo().alert().accept();
	     
	     //driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	     //driver.switchTo().alert().sendKeys("Testing");
	     //driver.switchTo().alert().accept();
	       
	     //driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	     //driver.switchTo().alert().dismiss();
	     WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(7));
	     driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	     w.until(ExpectedConditions.alertIsPresent());
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();
	     
	     
	}

}
