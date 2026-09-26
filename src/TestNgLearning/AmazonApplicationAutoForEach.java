package TestNgLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonApplicationAutoForEach {

	@Test
	public void AutomateAmazon() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// Search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		String checkboxName="Get It by Tomorrow";
		// Apply filter

		String xpath = "//span[normalize-space(text())='%s']/ancestor::li//input[@type='checkbox']/following-sibling::i";
		xpath = String.format(xpath, checkboxName);

		WebElement checkbox = driver.findElement(By.xpath(xpath));

		if(!checkbox.isSelected()) {
		    checkbox.click();
		}
		
		String expected = "iPhone Air 256 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space Black";
		// Click product
		String parent=driver.getWindowHandle();
		List<WebElement> elements=driver.findElements(By.xpath("//a/h2/span"));
		for(WebElement element:elements) {
			if(element.getText().equals(expected))
				element.click();	
		}
		Thread.sleep(5000);
//		Set<String> windows=driver.getWindowHandles();
		for(String multi:driver.getWindowHandles()) {
			if(!parent.equalsIgnoreCase(multi)){
				driver.switchTo().window(multi);
//				System.out.println(driver.switchTo().window(multi).getTitle());
				Thread.sleep(2000);
				String actual = driver.findElement(By.id("productTitle")).getText();
				Assert.assertEquals(actual, expected,"Matched the strings");
				if(actual.contains(expected)){
				    System.out.println("Our expectation is reached");
				} else {
				    System.out.println("Product does not match");
				}
			}
		}

		driver.quit();
}
}
