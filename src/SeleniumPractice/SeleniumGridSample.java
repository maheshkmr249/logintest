package SeleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridSample {
    public static void main(String[] args) {
        // 1. Set up Chrome choices
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "chrome");
        options.setCapability("platformName", "Windows"); // Change based on your Node OS

        WebDriver driver = null;

        try {
            // 2. Initialize RemoteWebDriver targeting the Hub address
            URL hubUrl = new URL("http://localhost:4444");
            System.out.println("Connecting to Grid hub...");
            driver = new RemoteWebDriver(hubUrl, options);

            // 3. Run test steps
            driver.get("https://google.com");
            System.out.println("Page Title is: " + driver.getTitle());

        } catch (MalformedURLException e) {
            System.err.println("Invalid Grid Hub URL provided: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4. Safely terminate the driver instance
            if (driver != null) {
                driver.quit();
                System.out.println("Grid session closed clean.");
            }
        }
    }
}
