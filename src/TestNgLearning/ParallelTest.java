package TestNgLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	@Test
	public void getFirefox(){
        
       System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.softwaretestingmaterial.com");
		 driver.manage().window().maximize();
		driver.close();
	}
	
	@Test
	public void getChorme() throws InterruptedException{
        
	    System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.softwaretestingmaterial.com");
		driver.close();
	}
}
