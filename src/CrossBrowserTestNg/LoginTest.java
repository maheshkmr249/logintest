package CrossBrowserTestNg;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @Parameters("browser")

    @BeforeMethod

    public void setup(String browser) throws Exception {

        launchBrowser(browser);

    }

    @Test

    public void googleTest() {

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

    }

    @AfterMethod

    public void tearDown() {

        driver.quit();

    }

}