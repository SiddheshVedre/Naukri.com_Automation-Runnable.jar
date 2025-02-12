package PagesAndAutomationWork;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProfilePage extends BasePageSetup {
	
	
	
	public ProfilePage(WebDriver driver) throws IOException {
		super(driver);
	}
	
	
@FindBy(xpath = "//*[@Class='icon edit ']")
WebElement btnEditIcaon;

@FindBy(xpath = "//*[text()='Save']")
WebElement btnSave;




	public void UpdateProfile() {
		
		
		 try {
		        System.out.println("Waiting for 'View Profile' button to be clickable...");
		        waitForElementToBeClickable(btnEditIcaon, 15);
		        System.out.println("'icon edit' button is clickable. Performing click action.");
		        btnEditIcaon.click();
		    } catch (TimeoutException e) {
		        System.out.println("Failed to click 'icon edit' button: TimeoutException occurred.");
		    }
		 
		 
		 try {
		        System.out.println("Waiting for 'View Profile' button to be clickable...");
		        waitForElementToBeClickable(btnSave, 15);
		        System.out.println("'Save' button is clickable. Performing click action.");
		        btnSave.submit();
		    } catch (TimeoutException e) {
		        System.out.println("Failed to click 'Save' button: TimeoutException occurred.");
		    }
		 
		 
		
		
	}
}
