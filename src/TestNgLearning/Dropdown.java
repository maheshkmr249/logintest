package TestNgLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public static void dropdown() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();
		//Once you got the select object initialised then you can access all the methods of select class. 
		//Identify the select HTML element:
		//Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.name("dropdown"));
		Select select = new Select(dropdown);
		//To select an option - selectByVisibleText, selectByIndex, selectByValue
		//selectByVisibleText
		//select.selectByValue("ddmanual");
		//select.selectByIndex(4);
		//select.selectByVisibleText("Performance Testing");
		List<WebElement> options = select.getOptions();
//		for(int i=0;i<=options.size()-1;i++)
//		{
//			System.out.println(options.get(i).getText());
//			if(options.get(i).getText().equals("Manual Testing"))
//			{
//				options.get(i).click();
//			}
//		}
		for (WebElement option : options) {

		    System.out.println(option.getText());

		    if (option.getText().equals("Manual Testing")) {
		        option.click();
		        break;
		    }
		}
		driver.close();
	}
}
