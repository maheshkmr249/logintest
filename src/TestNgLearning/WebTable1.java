package TestNgLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// Find all rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));

		// Iterate through each row
		for (WebElement row : rows) {

		    // Get all cells in the current row
		    List<WebElement> columns = row.findElements(By.xpath("./th | ./td"));

		    // Iterate through each column
		    for (WebElement column : columns) {

		        System.out.print(column.getText() + " | ");
		    }

		    System.out.println();
		}
   }
}

