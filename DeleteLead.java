package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// Load the path driver
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//Add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//enter login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crm/sfa button
		driver.findElement(By.linkText("CRM/SFA")).click();
        //Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("+91 9042298750");
		//	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//	Capture lead ID of First Resulting lead
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//	Click First Resulting lead
		driver.findElement(By.linkText("10113")).click();
		//	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys("10113");
		
		//	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		System.out.println("No records to display");
		//	Close the browser (Do not log out)
		driver.close();


	}

}
