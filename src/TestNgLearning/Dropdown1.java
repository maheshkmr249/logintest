package TestNgLearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown1 {
	@Test
public static void dropdown() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();
		WebElement dropdown = driver.findElement(By.name("dropdown"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Performance Testing");
		List<String> actualValues = new ArrayList<>();

		for (WebElement option : select.getOptions()) {
		    actualValues.add(option.getText());
		}
		System.out.println(actualValues);
		List<String> expectedValues =
		        Arrays.asList("–Select–","Selenium", "QTP", "Manual Testing", "Automation Testing", "Performance Testing");

		Assert.assertEquals(actualValues, expectedValues);
}
}