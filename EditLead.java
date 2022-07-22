package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
				//enter firstname
				driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("ARUN");
				//click lead button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				//CLICK ON FIRST RESULTING LEAD
				driver.findElement(By.xpath("//div[contains(@class, 'x-grid3-col-partyId')]/a[1]")).click();
				//verify title of the page
			    String title = driver.getTitle();
			    System.out.println("Title is: "+driver.getTitle());
			    //click edit
			    driver.findElement(By.linkText("Edit")).click();
			    //change company name
			    driver.findElement(By.id("updateLeadForm_companyName")).clear();
			    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HCL");
			    //CLICK UPDATE
			    driver.findElement(By.name("submitButton")).click();
			    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			    System.out.println(text);
			    //close browser
	    driver.close();


	}

}
