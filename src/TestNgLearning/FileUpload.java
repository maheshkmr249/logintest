package TestNgLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
	public void fileupload()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement upload = driver.findElement(By.id("file-upload"));
		upload.sendKeys("C:\\Users\\mahes\\OneDrive\\Desktop\\freelancer.jpg");
		driver.findElement(By.id("file-submit")).click();
		String exp = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		String act = "File Uploaded1!";
//		if(act.equals(exp))
//		{
//			System.out.println("File uploaded successfully");
//		}
//		else
//		{
//			System.out.println("File not uploaded");
//		}
		Assert.assertEquals(act, exp);
	}
}
