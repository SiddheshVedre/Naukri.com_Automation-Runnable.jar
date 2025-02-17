package PagesAndAutomationWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//>>>>>>>>>>>>>>>>>  Base : Page PageFactory Class  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
public class BasePageSetup {

    // >>>>>>>>>>>>>>>>>>>>>>>>  Base Page Class Driver  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	WebDriver driver;

    //>>>>>>>>>>>>>>>>> Text Colours <<<<<<<<<<<<<<<<<
	public static String NormalClr = "\u001B[0m";
	public static String GreenClr = "\u001B[32m";
	public static String BlueClr = "\u001B[33m";
	public static String RedClr = "\u001B[31m";

	//--------------------------------------------------------------------------------------------//
    // Page Factory initElements Setup
	
	public BasePageSetup(WebDriver driver) throws IOException {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	//--------------------------------------------------------------------------------------------//
    // Explicit Waits for all Page's Elements
	
	public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}