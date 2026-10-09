package SeleniumPractice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		HttpClient client = HttpClient.newHttpClient();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		List<WebElement> links =
		        driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

		    String url = link.getAttribute("href");

		    if (url == null || url.isEmpty()) {
		        continue;
		    }

		    try {

		        HttpRequest request = HttpRequest.newBuilder()
		                .uri(URI.create(url))
		                .method("HEAD", HttpRequest.BodyPublishers.noBody())
		                .build();

		        HttpResponse<Void> response =
		                client.send(
		                        request,
		                        HttpResponse.BodyHandlers.discarding()
		                );

		        int statusCode = response.statusCode();

		        if (statusCode >= 400) {
		            System.out.println(
		                    "Broken Link: " + url +
		                    " | Status Code: " + statusCode
		            );
		        } else {
		            System.out.println(
		                    "Valid Link: " + url +
		                    " | Status Code: " + statusCode
		            );
		        }

		    } catch (Exception e) {

		        System.out.println(
		                "Unable to access: " + url +
		                " | Error: " + e.getMessage()
		        );
		    }
		}

	}

}
