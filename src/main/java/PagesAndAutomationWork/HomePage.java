package PagesAndAutomationWork;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePageSetup {

	public HomePage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//  >>>>>>>>>>>>>>>>>>>>>>>>>  Elements Locatores	<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
@FindBy(xpath= "//span[@class='nI-gNb-sb__placeholder']")
WebElement btnjobSearchBar;

@FindBy(xpath= "//input[@placeholder='Enter keyword / designation / companies']")
WebElement txtdesignation;


@FindBy(xpath= "//*[@id='experienceDD']")
WebElement btnexperience;
	
@FindBy(xpath= "(//ul)[9]/child::li")
List<WebElement> btntellExperience;



@FindBy(xpath= "//input[@placeholder='Enter location']")
WebElement txtjobLocationclick;

@FindBy(xpath= "//span[normalize-space()='Search']")
WebElement btnpopupSearch;

@FindBy(xpath= "(//a[@class='nI-gNb-menuItems__anchorDropdown']/div)[1]")
WebElement eleJob;

@FindBy(xpath= "//div[@class='cust-job-tuple layout-wrapper lay-2 sjw__tuple ']")
List<WebElement> applications;

@FindBy(xpath= "//a[normalize-space()='View profile']")
WebElement btnViewProfile;






public void clickonProfile(){
	
    try {
        System.out.println("Starting the process to click on 'View Profile' button...");
        
        // Wait for 'View Profile' button to become clickable
        waitForElementToBeClickable(btnViewProfile, 15);
        System.out.println("'View Profile' button is clickable. Performing click action.");
        
        // Perform the click action
        btnViewProfile.click();
        
        
    } catch (TimeoutException e) {
        
        System.out.println(RedClr + "Error : Not Clickable" + NormalClr);
    	
    } catch (Exception e) {
        
        System.out.println(RedClr + "Error : Not Clickable" + NormalClr);
    	
    } 
  }


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Handling Search Bar Opration <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	public void SearchBar(String designation,String jobLocationclick, String  experience) {
		
	try {
		System.out.println("Starting the process to Search the Job Applications.....");
		
		// Wait for 'View Profile' button to become clickable
        waitForElementToBeClickable(btnjobSearchBar, 15);
        
		btnjobSearchBar.click();
		txtdesignation.sendKeys(designation);
		btnexperience.click();
		
		
		selectExperience(Integer.parseInt(experience));
		
		
		txtjobLocationclick.sendKeys(jobLocationclick);
		btnpopupSearch.click();	
	   }catch (TimeoutException e) {
	        
	        System.out.println(RedClr + "Search Bar Error" +NormalClr);
	    
	    } catch (Exception e) {
	        
	        System.out.println(RedClr + "Search Bar Error" + NormalClr);
	        
	    } 
	
	
	}
	
	
//  >>>>>>>>>>>>>>>>>>>>>>  Selecting Experience on Job Serach Bar  <<<<<<<<<<<<<<<<<<<<<<<<<
	public void selectExperience(int index) {
		
	try {	
		System.out.println("Starting the process of 'Selecting Experience on Dropdown'");
		
        // Check if the index is valid
        if (index >= 0 && index < btntellExperience.size()) {
            // Get the element from the list using the index and click it
            WebElement liElement = btntellExperience.get(index);
            liElement.click();
            
        } else {
            System.out.println("Invalid index: " + index);
        }
	   } catch (TimeoutException e) {
	        
	        System.out.println(RedClr + "Dropdown : Experience Not Selected Perfectly" + NormalClr);
	    	
	    } catch (Exception e) {
	        
	        System.out.println(RedClr +"Dropdown : Experience Not Selected Perfectly" + NormalClr);
	    	
	    }  
	}

}
