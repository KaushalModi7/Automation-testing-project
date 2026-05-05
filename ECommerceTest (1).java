package AutoProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceTest {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		  // 1. Open website
        driver.get("https://www.saucedemo.com/");  
        
        // 2. Login Test
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        // 3. select product
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        // 4. add to cart
        driver.findElement(By.id("add-to-cart")).click();
        // 5. go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        // 6. validate item added 
       boolean itempresent = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
       if (itempresent) {
    	   System.out.println("Test passed");
       }
       else {
    	   System.out.println("Test failed");
       }
         driver.quit();
}
}