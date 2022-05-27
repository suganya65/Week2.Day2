package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup Driver		
		WebDriverManager.chromedriver().setup();
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Step 6: Click on Create New Account button
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TEst");
		
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lastanme");
		
				
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9789067276");
		
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).click();
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Meceka@12");
		
				
		// Step 11: Handle all the three drop downs
		Select Date = new Select (driver.findElement(By.name("birthday_day")));
		Date.selectByValue("7");
		
		Select Month = new Select (driver.findElement(By.id("month")));
		Month.selectByValue("7");
		
		Select Year = new Select (driver.findElement(By.name("birthday_year")));
		Year.selectByValue("2010");
		
		
		// Step 12: Select the radio button "Female" 
		driver.findElement (By.xpath ("//input[@value=1]")).click( );
		
	}

}
