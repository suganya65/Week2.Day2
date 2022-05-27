package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Setup Driver		
				WebDriverManager.chromedriver().setup();
				
				//Open the browser
				ChromeDriver driver = new ChromeDriver();
				
				//Open the URL
				driver.get("https://acme-test.uipath.com/login");
				
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				
				//Enter email as "kumar.testleaf@gmail.com"
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				
				//Enter Password as "leaf@12"
				driver.findElement(By.id("password")).sendKeys("leaf@12");
				
				//Click login button
				driver.findElement (By.xpath ( "//button[contains(text(),'Login')]" ) ).click ( );
				
				// Get the title of the page and print
				String title = driver.getTitle();
				System.out.println(title);
				
				// Click on Log Out
				driver.findElement (By.xpath("//a[text()='Log Out']")).click ( );
				
				// Close the browser (use -driver.close())
				driver.close();
							
	}

}
