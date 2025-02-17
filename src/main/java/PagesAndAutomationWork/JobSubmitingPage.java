package PagesAndAutomationWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSubmitingPage extends  BasePageSetup {

	//--------------------------------------------------------------------------------------------//
    //BasePageSetup PageFactory
	
	public JobSubmitingPage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//--------------------------------------------------------------------------------------------//
    //Elements Locatores

	@FindBy(xpath = "//div[@class='styles_jhc__apply-button-container__5Bqnb']//button[2]")
	WebElement buttonXPath;
	
	
	
	
	//--------------------------------------------------------------------------------------------//
	//All Page Level Oprations
	
   // >>>>>>>>>>> JobSubmitPage : Click On Apply Button of all Open Profile <<<<<<<<<<<<<<<<<<
	public void ApplyClick() {

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		List<String> childWindows = new ArrayList<>(); 

		while (iterator.hasNext()) {

			childWindows.add(iterator.next());

		}

		for (int i = 0; i < childWindows.size(); i++) {
			String childWindow = childWindows.get(i);
			driver.switchTo().window(childWindow);

			buttonXPath.click();

		}

		driver.switchTo().window(parentWindow);

	}
	
	
	
}
	