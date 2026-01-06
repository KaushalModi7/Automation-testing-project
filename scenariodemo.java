package AutoProject;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class scenariodemo {
	
	@Test
    public void scenerio() {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("htttps://www.amazon.in/");
    	
    	String Title = driver.getTitle();
    	String originalwindow = driver.getWindowHandle();
    	ChromeOptions option = new ChromeOptions();
    	option.addArguments("--incognito");
    	
    	WebDriver incognitoDriver = new ChromeDriver(option);
    	incognitoDriver.get("https://www.amazon.in/");
    	incognitoDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Title);
    	incognitoDriver.quit();
    	driver.switchTo().window(originalwindow);
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	//Files.copy(src.toPath(),new File("AutoProject"));
    	
    	
    }

}
