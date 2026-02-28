package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 
 
 driver.manage().window().maximize();
 Thread.sleep(3000);
 driver.manage().window().minimize();
 Thread.sleep(3000);
 driver.manage().window().fullscreen();
 Thread.sleep(3000);
 driver.quit();
	}

}
