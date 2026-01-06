package AutoProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertDemo {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://demoqa.com/login");
	     JavascriptExecutor js  =  (JavascriptExecutor)driver;
	     WebElement scroll = driver.findElement(By.xpath("//div/h1[text()='Login']"));
	     js.executeScript("arguments[0].scrollIntoView()",scroll);
	     driver.findElement(By.xpath("//form/div/div/input[@id='userName']")).sendKeys("1234");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@777");
	     driver.findElement(By.id("login")).click();
	     //Thread.sleep(7);
	     //String Errormessage = driver.findElement(By.xpath("//p[@id='name']")).getText();
	     //System.out.println(Errormessage);
	     

	}

	

}
