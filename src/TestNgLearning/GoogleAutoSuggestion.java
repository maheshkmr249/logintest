package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleAutoSuggestion {

	@Test
	public void OpenGoogle() throws InterruptedException
	{

	WebDriver driver=new ChromeDriver();
	System.out.println("Launching Google......");
	driver.get("http://google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("ind");
	Thread.sleep(5000);
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
	System.out.println(list.size());
	
	for(int i=0; i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("indeed"))
		{
			list.get(i).click();
			break;
		}
	}
	Thread.sleep(3000);
	//driver.findElement(By.partialLinkText("Government of India")).click();
//	driver.close();
}
}
