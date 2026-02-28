package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys("tanu@123");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("Asd2345@");
		 Thread.sleep(2000);
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(3000);
		Thread.sleep(3000);
		
//               String actualtitle=driver.getTitle();
//		String expectedtitle="Log in to Facebook";
//		 System.out.println("Actual Title: " + actualtitle);
//		if(actualtitle.equals(expectedtitle)) {
//			System.out.println("Login successful - Title matched");
//		} else {
//			System.out.println("Login failed - Title not matched");
//			
//		}
		driver.quit();
    }

}
