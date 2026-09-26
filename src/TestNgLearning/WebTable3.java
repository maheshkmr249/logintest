package TestNgLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String company = "Island Trading";

		WebElement row = driver.findElement(
		    By.xpath("//table[@id='customers']//tr[td[1][normalize-space()='" 
		           + company + "']]")
		);

		String contact = row.findElement(By.xpath("./td[2]")).getText();
		String country = row.findElement(By.xpath("./td[3]")).getText();

		System.out.println("Company : " + company);
		System.out.println("Contact : " + contact);
		System.out.println("Country : " + country);

	}

}
