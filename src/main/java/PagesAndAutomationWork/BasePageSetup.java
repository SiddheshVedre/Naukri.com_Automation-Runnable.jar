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

// >>>>>>>>>>>>>>>>>>>>>>>>  PageFactory Method With driver Cunstructor  <<<<<<<<<<<<<<<<<<<<<< 
public BasePageSetup(WebDriver driver) throws IOException {
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
	
	
	

  }

public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
	
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    
    wait.until(ExpectedConditions.elementToBeClickable(element));
}

}