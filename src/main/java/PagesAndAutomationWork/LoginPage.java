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
	
	@FindBy(xpath= "//div[@class='server-err']")
	WebElement ErrorMsgLogin;

	

	public void NaukriLogin(String username, String password) throws Exception {
		

	    try {
	        System.out.println("Starting login process...");
	        waitForElementToBeClickable(btnLoginBtn, 15);
	        btnLoginBtn.click();

	        waitForElementToBeClickable(txtEmailField, 15);
	        txtEmailField.sendKeys(username);

	        waitForElementToBeClickable(txtPasswordField, 15);
	        txtPasswordField.sendKeys(password);

	        waitForElementToBeClickable(btnPopupLoginButton, 15);
	        btnPopupLoginButton.click();
	        
	        // Check if the error message element is visible and contains the expected text
	        if (ErrorMsgLogin.isDisplayed()) {
	            String errorMessage = ErrorMsgLogin.getText();
	            if (errorMessage.contains("Invalid details. Please check the Email ID - Password combination.")) {
	                System.err.println(RedClr + "Login Error: " + errorMessage + NormalClr);
	                throw new Exception("Login failed due to invalid credentials.");
	            }
	        }
	        
	        System.out.println("Login successful.");

	        
	    } catch (TimeoutException e) {
	        
	        System.out.println(RedClr + "Login Error : Username or Password Missmatch" + NormalClr);
	        throw e;


	    } catch (Exception e) {
	        
	        System.out.println(RedClr + "Login Error : Username or Password Missmatch" + NormalClr);
	        throw e;
	        
	    } finally {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed after login attempt.");
	        }
	 }
	    
	    
	    
  }
}


