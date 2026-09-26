package SeleniumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Grid1 {
	 WebDriver driver =null;
	
	 @BeforeClass
	 public void launchbrowser() throws MalformedURLException
	 {
		 ChromeOptions options = new ChromeOptions();
		 options.setCapability("browserName", "chrome");
		 options.setCapability("platformName", "Windows"); // Change based on your Node OS
		 URL hubUrl = new URL("http://localhost:4444");
		 System.out.println("Connecting to Grid hub...");
		 driver = new RemoteWebDriver(hubUrl, options);
	 }
	
	@Test(priority=1)
	public void grid()  {
	
    driver.get("https://google.com");
    System.out.println("Page Title is: " + driver.getTitle());
	}
    @Test(priority=2)
	public void OpenGoogle1() throws InterruptedException
	{

//	WebDriver driver=new ChromeDriver();
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
	}
	
    @AfterClass
	 public void closebrowser()
	 {
		driver.quit();
	 }
}
