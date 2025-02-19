package PagesAndAutomationWork;

import java.io.IOException;

import java.util.List;


import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePageSetup {

	//--------------------------------------------------------------------------------------------//
    //BasePageSetup PageFactory
	
	public HomePage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//--------------------------------------------------------------------------------------------//
    //Elements Locatores
	
	@FindBy(xpath = "//span[@class='nI-gNb-sb__placeholder']")
	WebElement btnjobSearchBar;

	@FindBy(xpath = "//input[@placeholder='Enter keyword / designation / companies']")
	WebElement txtdesignation;

	@FindBy(xpath = "//*[@id='experienceDD']")
	WebElement btnexperience;

	@FindBy(xpath = "(//ul)[9]/child::li")
	List<WebElement> btntellExperience;

	@FindBy(xpath = "//input[@placeholder='Enter location']")
	WebElement txtjobLocationclick;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	WebElement btnpopupSearch;

	@FindBy(xpath = "(//a[@class='nI-gNb-menuItems__anchorDropdown']/div)[1]")
	WebElement eleJob;

	@FindBy(xpath = "//div[@class='cust-job-tuple layout-wrapper lay-2 sjw__tuple ']")
	List<WebElement> applications;

	@FindBy(xpath = "//a[normalize-space()='View profile']")
	WebElement btnViewProfile;



    //--------------------------------------------------------------------------------------------//
	 //All Page Level Oprations


	// >>>>>>>>>>> HomePage : click on Profile Button Handling <<<<<<<<<<<<<<<<<<
	public void clickonProfile() {

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

	// >>>>>>>>>>> HomePage : Search Bar Opration Handling <<<<<<<<<<<<<<<<<<
	public void SearchBar(String designation, String jobLocationclick, String experience) {

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
		} catch (TimeoutException e) {

			System.out.println(RedClr + "Search Bar Error" + NormalClr);

		} catch (Exception e) {

			System.out.println(RedClr + "Search Bar Error" + NormalClr);

		}

	}

	
	// >>>>>>>>>>> HomePage : Selecting Experience on Job Serach Bar Dropdown <<<<<<<<<<<<<<<<<<
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

			System.out.println(RedClr + "Dropdown : Experience Not Selected Perfectly" + NormalClr);

		}
	}

	
	// >>>>>>>>>>> HomePage : Selecting Applications Passed in Excel File <<<<<<<<<<<<<<<<<<
	public void applications(int applications2) {

		Actions actions = new Actions(driver);

		// Click on the 20 applications
		for (int i = 0; i < applications2 && i < applications.size(); i++) {
			actions.moveToElement(applications.get(i)).click().perform();
		}

	}

}
