package BasePackage;

import java.time.LocalDate;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {
	
	public static WebDriver driver;
	
	public static void Selenium() {
		
		
		System.out.println("Selenium Setup Start Working");
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear());
		
		String url = "https://www.naukri.com/";
	   
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		

		// Navigate to the provided URL
		driver.get(url);
		driver.manage().window().maximize();
		
		
       // Print the page title
       System.out.println("Page title is: " + driver.getTitle());

      
	}
	

}
