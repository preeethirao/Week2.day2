package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		//Assignment:1

		//FaceBook:
		//================================
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
	    driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("preethi");
		// Step 8: Enter the last name
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rao");
		// Step 9: Enter the mobile number
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("preeethirao91@gmail");
		// Step 10: Enterthe password
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Jillu@17");
		// Step 11: Handle all the three drop downs
	    //date
	    WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
	    Select sel=new Select (element);
	    sel.selectByIndex(2);
	    //month
	    WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
	    Select sel1=new Select (element2);
	    sel1.selectByValue("5");
	    //year
	    WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select sel2= new Select(element3);
	    sel2.selectByVisibleText("2019");
	    // Step 12: Select the radio button "Female" 
	    driver.findElement(By.xpath("//input[@name='sex']")).click();
	      //( A normal click will do for this step) 

	}

}
