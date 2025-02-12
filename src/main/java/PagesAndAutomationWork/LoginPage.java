package PagesAndAutomationWork;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageSetup {
	
	public LoginPage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//a[@id='login_Layer']")
	WebElement btnLoginBtn;

	@FindBy(xpath= "//input[@placeholder='Enter your active Email ID / Username']")
	WebElement txtEmailField;


	@FindBy(xpath= "//input[@placeholder='Enter your password']")
	WebElement txtPasswordField;
		
	@FindBy(xpath= "//button[@type='submit']")
	WebElement btnPopupLoginButton;

	

	public void NaukriLogin(String username, String password) {
		

		 try {
		        System.out.println("Waiting for 'Login' button to be clickable...");
		        waitForElementToBeClickable(btnLoginBtn, 15);
		        System.out.println("'Login' button is clickable. Performing click action.");
		        btnLoginBtn.click();
		    } catch (TimeoutException e) {
		        System.out.println("Failed to click 'Login' button: TimeoutException occurred.");
		    }
		 

		 try {
		        System.out.println("Waiting for 'Email id/ Username' TextField to be clickable...");
		        waitForElementToBeClickable(txtEmailField, 15);
		        System.out.println("'Email id/ Username' TextField is clickable. Performing click action.");
		        txtEmailField.sendKeys(username);
		    } catch (TimeoutException e) {
		        System.out.println("Failed to click 'Email id/ Username' TextField: TimeoutException occurred.");
		    }
		 

		 try {
		        System.out.println("Waiting for 'Password' TextField to be clickable...");
		        waitForElementToBeClickable(txtPasswordField, 15);
		        System.out.println("'Password' TextField is clickable. Performing click action.");
		        txtPasswordField.sendKeys(password);
		    } catch (TimeoutException e) {
		        System.out.println("Failed to click 'Password' TextField: TimeoutException occurred.");
		    }
		 

		 try {
		        System.out.println("Waiting for 'Login Submit' button to be clickable...");
		        waitForElementToBeClickable(btnPopupLoginButton, 15);
		        System.out.println("'icon edit' button is clickable. Performing click action.");
		        btnPopupLoginButton.click();
		    } catch (TimeoutException e) {
		        System.out.println("Failed to click 'Login Submit' button: TimeoutException occurred.");
		    }
	
		
		
	 }

}


