package BasePackage;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesAndAutomationWork.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {
	
	public static WebDriver driver;
	
	//>>>>>>>>>>>>>>>>> Text Colours <<<<<<<<<<<<<<<<<//
	public static String NormalClr = "\u001B[0m";
	public static String  GreenClr = "\u001B[32m";
	public static String  BlueClr = "\u001B[33m";
	public static String RedClr = "\u001B[31m";
	public static String CyanClr = "\u001B[46m";
			
	
	       
	       
	
	public static void Selenium(String username, String password) throws IOException {
		
		//--------------------------------------------------------------------------------------------//
	     // Selenium Setup
		
		System.out.println("Selenium Setup Start Working.....");

		String url = "https://www.naukri.com/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Navigate to the provided URL
		driver.get(url);
		driver.manage().window().maximize();

		// Print the page title
		System.out.println("Page title is: " + driver.getTitle());

		
		//--------------------------------------------------------------------------------------------//
	     // Login Function Using Selenium
		
		LoginPage Lp = new LoginPage(driver);

		Lp.NaukriLogin(username, password);
		System.out.println("Login successful.");

      
	}
	
}
