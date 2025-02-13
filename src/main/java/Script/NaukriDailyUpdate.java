package Script;

import java.util.Scanner;

import BasePackage.SeleniumSetup;
import PagesAndAutomationWork.HomePage;
import PagesAndAutomationWork.LoginPage;
import PagesAndAutomationWork.ProfilePage;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class NaukriDailyUpdate extends SeleniumSetup {
	

	

	public void NaukriProfileUpdate(String username, String password) throws Exception {

		


	
		SeleniumSetup Sp = new SeleniumSetup();
		Sp.Selenium();
		
	//Classes Added here
		LoginPage Lp = new LoginPage(driver);
		HomePage Hp = new HomePage(driver);
		ProfilePage Pp = new ProfilePage(driver);
		
   //Steps For Automate Profile Update
		Lp.NaukriLogin(username, password);
		System.out.println("Login successful.");
		
		Hp.clickonProfile();
		System.out.println("'View Profile' button clicked successfully.");
		
		
		Pp.UpdateProfile();
		System.out.println(GreenClr + "Profile updated successfully." + NormalClr);
	 	  
	    
	
	
	
	
  }
}
