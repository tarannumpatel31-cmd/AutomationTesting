package Assignment12;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class que12 {
	public static void main(String[] args) throws InterruptedException {
//Que : 12.Task 2: ClassName & TagName Locator • Open Facebook • Locate email field using className • Find total number of links using tagName(“a")  
           WebDriver driver =new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://www.facebook.com/");
           driver.findElement(By.className("inputtext")).sendKeys("Tanu@srdgv");
           List<WebElement> links=driver.findElements(By.tagName("a"));
            System.out.println("Total number of links on Facebook page :"+ links.size());
//            Thread.sleep(2000);
            driver.quit();
	}

}
