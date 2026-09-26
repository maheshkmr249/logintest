package TestNgLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {

	@Test
	public void RightclickTest() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();		                  
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement event=driver.findElement(By.linkText("Images"));
		action.contextClick(event).build().perform();
	}
}
