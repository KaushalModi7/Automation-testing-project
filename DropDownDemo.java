package AutoProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo {
	
	@Test
	public void dropdown() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#select%20Country");
		WebElement opendrp =  driver.findElement(By.tagName("select"));
		Select select = new Select(opendrp);
		//select.selectByValue("BRA");
		//select.selectByIndex(10);
		//select.selectByVisibleText("Cuba");
		List<WebElement> option = select.getOptions();
		for(WebElement getOptions : option) {
			System.out.println(getOptions.getText());
		}
				
	}

}
