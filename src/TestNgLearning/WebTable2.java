package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));

		for (WebElement row : rows) {

		    List<WebElement> columns = row.findElements(By.tagName("td"));

		    for (WebElement column : columns) {
		        System.out.print(column.getText() + " | ");
		    }

		    System.out.println();
		}
	}
}
