package Assignment13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com");
	  	  Thread.sleep(2000);
		
            driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		  Thread.sleep(2000);
  	      driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
  	 Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		  Thread.sleep(3000);
		  
		  driver.quit();

	}

}
