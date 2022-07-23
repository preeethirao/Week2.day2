package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftapbutton {

	public static void main(String[] args) {
		// Load the path driver
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://leafground.com/pages/Button.html");
		//maximize the window
		driver.manage().window().maximize();
		//Add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click to homepage
		driver.findElement(By.xpath("//button[@id='home']")).click();
		//Find position of button (x,y)
		driver.navigate(). to ("http://leafground.com/pages/Button.html");
        Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
        System.out.println(location);
        //find button color
       System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
        //Find the height and width
        System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());


	}

}
