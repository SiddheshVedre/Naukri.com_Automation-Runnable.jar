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
	        System.out.println("Waiting for 'View Profile' button to be clickable...");
	        waitForElementToBeClickable(btnViewProfile, 15);
	        System.out.println("'View Profile' button is clickable. Performing click action.");
	        btnViewProfile.click();
	    } catch (TimeoutException e) {
	        System.out.println("Failed to click 'View Profile' button: TimeoutException occurred.");
	    }
	
 }



}
