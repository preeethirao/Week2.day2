package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftapsedit {

	public static void main(String[] args) {
		// Load the path driver
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				//Load the URL
				driver.get("http://leafground.com/");
				//maximize the window
				driver.manage().window().maximize();
				//Add the wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//click edit button
				driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']")).click();
		
				//enter email address
				driver.findElement(By.id("email")).sendKeys("Preeethirao@gmail.com");
				//Append a text and press keytab
				driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Testleaf", Keys.TAB);
							//value
				String attribute = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
				System.out.println(attribute);
				//clear the text
				driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
				//confirm edit field is disabled
			System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Confirm ')]/following::input")).isEnabled());	
			
			
				
				

	}

}
