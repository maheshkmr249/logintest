package TestNgLearning;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonPractice {
	
	@Test
	public void LaunchAmazon() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 17");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Get It by Tomorrow')]/preceding-sibling::div/label/i")).click();
//		String xpath = "//span[contains(text(),'%s')]/preceding-sibling::div/label/i";
//		String TextName = "Get It by Tomorrow";
//		xpath = String.format(xpath,TextName);
//		WebElement checkbox = driver.findElement(By.xpath(xpath));
//		if(!checkbox.isSelected())
//		checkbox.click();
		String expected = "iPhone Air 256 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space Black";
	    String parentwindow = driver.getWindowHandle();
		List<WebElement> elements = driver.findElements(By.xpath("//a/h2/span"));
	    for(int i=0; i<elements.size();i++)
	    {
	    	if(elements.get(i).getText().equals(expected))
	    	{
	    		elements.get(i).click();
	    	}
	    }
	Thread.sleep(5000); 
	Set<String> WindowHandles = driver.getWindowHandles();
	for(String Handles:WindowHandles)
	{
		if(!parentwindow.equals(Handles))
		{
			driver.switchTo().window(Handles);
			Thread.sleep(2000);
//			System.out.println("Title is: "+driver.getTitle());
			String actual = driver.findElement(By.id("productTitle")).getText();
			if(actual.contains(expected))
			{
				System.out.println("This is the expected product");
			}
			else
			{
				System.out.println("This is not the expected product");
			}
		}
	 }
   }
}

//driver.findElement(By.xpath("//span[contains(text(),'Get It by Tomorrow')]/preceding-sibling::div/label/i")).click();

//String xpath = //span[contains(text(),'%s')]/preceding-sibling::div/label/i
//String TextName = "Get It by Tomorrow"
//xpath = String.format(xpath,TextName)
//WebElement checkbox = driver.findElemen(By.xpath(xpath))
//if(!checkbox.isSelected)
//checkbox.click();