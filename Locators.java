package AutoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/login/");
	     //driver.findElement(By.id("email")).sendKeys("Test");
	     //driver.findElement(By.name("email")).sendKeys("kaushal");
	     //driver.findElement(By.className("inputtext")).sendKeys("TEST");
	     //driver.findElement(By.linkText("Forgotten account?")).click();
	     //driver.findElement(By.partialLinkText("Sign")).click();
	     //driver.findElement(By.cssSelector("input[name='email']")).sendKeys("start");
         //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("start");
	     //String text = driver.findElement(By.tagName("button")).getText();
	     //System.out.println(text);

	}

}
