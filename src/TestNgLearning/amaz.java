package TestNgLearning;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amaz{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 17");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 17");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("//span[contains(text(),'Get It by Tomorrow')]/parent::a//i")).click();
String expected = "iPhone Air 256 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space Black";
List<WebElement> list = driver.findElements(By.xpath("//a//h2//span"));
for(int i=0; i<list.size();i++)
{
if(list.get(i).getText().equals(expected))
{
list.get(i).click();
}
}
Thread.sleep(5000);
String parent = driver.getWindowHandle();
Set<String> elements = driver.getWindowHandles();
for(String elementsList: elements)
{
if(!parent.equals(elementsList))
{
driver.switchTo().window(elementsList);
Thread.sleep(5000);
String actual = driver.findElement(By.id("productTitle")).getText();
if(actual.contains(expected))
{
System.out.println("Expected product is found");
}
else
{
System.out.println("Expected product not found");
}
}
}
driver.close();
driver.quit();
}
}