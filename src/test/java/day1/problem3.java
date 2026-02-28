package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
   public class problem3 {
       public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 WebElement loginbutton=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		 
		 if (loginbutton.isEnabled()) {
			    System.out.println("Button is ENABLED");
			} else {
			    System.out.println("Button is DISABLED");
			}
		  driver.quit();
	}
}