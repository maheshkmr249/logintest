package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(
		        By.xpath("//table[@id='customers']/tbody/tr[position()>1]")
		);

		for (WebElement row : rows) {

		    List<WebElement> columns = row.findElements(By.tagName("td"));

		    String companyName = columns.get(0).getText();

		    if (companyName.equals("Island Trading")) {

		        String contact = columns.get(1).getText();
		        String country = columns.get(2).getText();
		       

		        System.out.println("Company: " + companyName);
		        System.out.println("Contact: " + contact);
		        System.out.println("Country: " + country);
		       
		        break;
		    }
		}
    }
}
