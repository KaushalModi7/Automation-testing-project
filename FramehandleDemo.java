package AutoProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramehandleDemo {
	
	@Test
    public void framehandle() {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    	driver.get("https://jqueryui.com/droppable");
    	System.out.println(driver.findElement(By.tagName("iframe")).getSize());
    	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    	Actions action = new Actions(driver);
    	WebElement source =driver.findElement(By.id("draggable"));
    	WebElement target =driver.findElement(By.id("droppable"));
    	action.dragAndDrop(source, target).build().perform();
    	driver.switchTo().defaultContent();
    	driver.findElement(By.linkText("Visual feedback")).click();
    }

}
