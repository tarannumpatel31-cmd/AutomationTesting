package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class program6 {
           public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // Open application
		        driver.get("https://www.facebook.com/");

		        // getTitle()
		        String title = driver.getTitle();
		        System.out.println("Page Title: " + title);

		        // getCurrentUrl()
		        String url = driver.getCurrentUrl();
		        System.out.println("Current URL: " + url);

		        // getPageSource()
		        String pageSource = driver.getPageSource();
		        if (pageSource.contains("Facebook")) {
		            System.out.println("Text 'Facebook' is present in Page Source");
		        }

		        driver.quit();
		    }
		}

	


