package CrossBrowserTestNg;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {

    WebDriver driver;

    public void launchBrowser(String browser) throws Exception {

        if(browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            URL url = new URL("http://localhost:4444");
            driver = new RemoteWebDriver(url, options);

        }

        else if(browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();

            URL url = new URL("http://localhost:4444");
            driver = new RemoteWebDriver(url, options);

        }

        else if(browser.equalsIgnoreCase("edge")) {

            EdgeOptions options = new EdgeOptions();

            URL url = new URL("http://localhost:4444");
            driver = new RemoteWebDriver(url, options);

        }

        driver.manage().window().maximize();

    }

}