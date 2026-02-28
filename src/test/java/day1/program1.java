package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class program1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
    driver.manage().window().maximize();
   
  driver.get("https://www.facebook.com/");
 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(" rdgnvb ");
 driver.findElement(By.xpath(""));
 
   driver.quit();
   

	}}

