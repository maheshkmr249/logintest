package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonDropdown {

	@Test
	public void AmazonDrop() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();	
	driver.get("http://amazon.in");
	Thread.sleep(5000);
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	List<WebElement> mylist=drop.findElements(By.tagName("option"));
	System.out.println(mylist.size());
//	for(int i=0;i<mylist.size();i++)
//	{
//		System.out.println(mylist.get(i).getText());
//	}
	for(WebElement list:mylist)
	{
		System.out.println(list.getText());
	}
  }
}