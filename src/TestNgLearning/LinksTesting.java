package TestNgLearning;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
			   
			   links.get(i).click();
			   System.out.println(driver.getCurrentUrl());
			   driver.navigate().back();
			   links=driver.findElements(By.tagName("a"));
			}
			System.out.println(links.get(i).getText());
		}
	}
}
