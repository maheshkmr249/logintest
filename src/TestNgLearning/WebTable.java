package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();		                  
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		 driver.manage().window().maximize();
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total no of row count is: "+rowCount);
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2; i<=7;i++)
		{
			String actualXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading")) {
			System.out.println("company name: "+ element.getText() + " is found" + "at postion: "+(i-1));
			break;
			}
		}
		
		System.out.println("****************");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String afterXpathContact = "]/td[2]";
		for(int i=2; i<=7;i++)
		{
		String actualXpath = beforeXpath+i+afterXpathContact;
		WebElement element = driver.findElement(By.xpath(actualXpath));
		System.out.println(element.getText());
		}
		
		System.out.println("****************");
		
		String afterXpathCountries = "]/td[3]";
		for(int i=2; i<=7;i++)
		{
		String actualXpath = beforeXpath+i+afterXpathCountries;
		WebElement element = driver.findElement(By.xpath(actualXpath));
		System.out.println(element.getText());
		}
		
		System.out.println("***************");
		//Handling web table columns
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		String colBeforeXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath = "]";
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colCount = cols.size();
		System.out.println("Total Columns count is: "+colCount);
		System.out.println("Column values are:");
		for(int i=1; i<=colCount; i++) {
			
		WebElement element = driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
		String colText = element.getText();
		System.out.println(colText);
		}
	}
}
