package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) throws InterruptedException {
		// 1 Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2.️⃣ Open Application URL
     driver.get("https://www.facebook.com/");
    

        //3.️⃣ Capture Actual Title
        String act_title = driver.getTitle();
        System.out.println("Actual Title: " + act_title);
      
        // Expected Title
        String exp_title = "Facebook – log in or sign up";

        // 4.Validate Title
        if (act_title.equals(exp_title)) {
            System.out.println(" Test Passed: Title matched");
        } else {
            System.out.println(" Test Failed: Title not matched");
        }
      Thread.sleep(3000);
//      getCurrentUrl() method
      // Returns the URL of the currently opened page.

      String currentUrl = driver.getCurrentUrl();
      System.out.println("Current URL: " + currentUrl);

        // 5 Close Browser
        driver.quit();
    }



	}
	


