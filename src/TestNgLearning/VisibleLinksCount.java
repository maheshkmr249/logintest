package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibleLinksCount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
//		driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Blog")).click();
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of links is "+links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				count++;
			}
			System.out.println(links.get(i).getText());
		}
		
		System.out.println("Visible links count is "+count);
		System.out.println("Hidden links count is "+(links.size()-count));
	}
}
