package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		  // 1. Initialize Chrome Options
        ChromeOptions options = new ChromeOptions();
        
        // 2. Add headless flags
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");

        // 3. Initialize the WebDriver with options
        WebDriver driver = new ChromeDriver(options);
        
        try {
            // 4. Run automation
            driver.get("https://facebook.com");
            System.out.println("Page Title is: " + driver.getTitle());
        } finally {
            // 5. Always quit the session
            driver.quit();
        }
	}
}
