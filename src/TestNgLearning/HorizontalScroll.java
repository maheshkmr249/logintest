package TestNgLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HorizontalScroll {
	WebDriver driver;
    @Test
    public void ScrollHorizontally() {
        
    	driver = new ChromeDriver();		
        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
        driver.manage().window().maximize();    
        WebElement Element = driver.findElement(By.linkText("VBScript"));
        //This will scroll the page Horizontally till the element is found	
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
