package BasePackage;

import java.time.LocalDate;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {
	
	public static WebDriver driver;
	
	//>>>>>>>>>>>>>>>>> Text Colours <<<<<<<<<<<<<<<<<
	public static String NormalClr = "\u001B[0m";
	public static String  GreenClr = "\u001B[32m";
	public static String  BlueClr = "\u001B[33m";
	public static String RedClr = "\u001B[31m";
			
	
	       
	       
	
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
