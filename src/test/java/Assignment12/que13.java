package Assignment12;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class que13 {
//	 Que : 13 .Task 3: XPath by Attribute • Open OrangeHRM • Locate username using XPath attribute • Locate login button using XPath
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://opensource-demo.orangehrmlive.com/");
         Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(" Admin");
        Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
         Thread.sleep(2000);
         driver.quit();
	}

}
