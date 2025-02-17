package PagesAndAutomationWork;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProfilePage extends BasePageSetup {
	
	
	//--------------------------------------------------------------------------------------------//
    //BasePageSetup PageFactory
	
	public ProfilePage(WebDriver driver) throws IOException {
		super(driver);
	}
	
	//--------------------------------------------------------------------------------------------//
    //Elements Locatores
	
	@FindBy(xpath = "//*[@Class='icon edit ']")
	WebElement btnEditIcaon;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement btnSave;



	//--------------------------------------------------------------------------------------------//
	//All Page Level Oprations
	
   // >>>>>>>>>>> ProfilePage : Update Profile Setup <<<<<<<<<<<<<<<<<<
	public void UpdateProfile() {
		
		try {
	        System.out.println("Starting the profile update process...");
	        
	        // Step 1: Click the 'Edit Icon' button
	        System.out.println("Waiting for 'Edit Icon' button to be clickable...");
	        waitForElementToBeClickable(btnEditIcaon, 15);
	        System.out.println("'Edit Icon' button is clickable. Performing click action.");
	        btnEditIcaon.click();

	        // Step 2: Click the 'Save' button
	        System.out.println("Waiting for 'Save' button to be clickable...");
	        waitForElementToBeClickable(btnSave, 15);
	        System.out.println("'Save' button is clickable. Performing submit action.");
	        btnSave.submit();

	       
	    } catch (TimeoutException e) {
	        
	        System.out.println(RedClr + "Error : Profile Not Updated Properly" + NormalClr);
	        return;
	        
	    } catch (Exception e) {
	        
	        System.out.println(RedClr + "Error : Profile Not Updated Properly" + NormalClr);
	    	return;
	    } 
		
	}
	
	
	
	
}
