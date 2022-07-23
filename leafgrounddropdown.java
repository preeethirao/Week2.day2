package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgrounddropdown {

	public static void main(String[] args) {
		// Load the path driver
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				//Load the URL
				driver.get("http://leafground.com/pages/Dropdown.html");
				//maximize the window
				driver.manage().window().maximize();
				//Add the wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Select program using index
				WebElement drop1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
				Select down1 = new Select(drop1);
				down1.selectByIndex(3);
				//Select program using Text
				WebElement drop2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
				Select down2=new Select(drop2);
				down2.selectByVisibleText("Selenium");
				//Select program using value
               WebElement drop3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
               Select down3=new Select (drop3);
               down3.selectByValue("4");
               //sendkeys to select
               driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
               //select program
               driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[3]")).click();
               
				
				
						

	}

}
