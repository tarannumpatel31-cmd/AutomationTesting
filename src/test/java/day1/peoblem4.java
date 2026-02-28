package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class peoblem4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys("@rgygcc67565#");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("987uj$%&");
		 Thread.sleep(2000);
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(5000);
		
     WebElement errormsg=driver.findElement(By.xpath("//a[text()='Find your account and log in.']"));

		if(errormsg.isDisplayed()) {
			System.out.println("Error message is displayed");
            System.out.println("Message: " + errormsg.getText());
        } else {
            System.out.println("Error message is NOT displayed");
        }
		
		 driver.quit();
	}

}