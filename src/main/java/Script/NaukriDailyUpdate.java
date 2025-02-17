package Script;



import BasePackage.SeleniumSetup;
import PagesAndAutomationWork.HomePage;
import PagesAndAutomationWork.ProfilePage;




public class NaukriDailyUpdate extends SeleniumSetup {
	
	public void NaukriProfileUpdate() throws Exception {

		//--------------------------------------------------------------------------------------------//
	     // Pages Structure 
		
		HomePage Hp = new HomePage(driver);
		ProfilePage Pp = new ProfilePage(driver);
		
		//--------------------------------------------------------------------------------------------//
         //Steps For Automate: Profile Update
		
		Hp.clickonProfile();
		System.out.println(CyanClr + "'View Profile' button clicked successfully." + NormalClr);
		
		Pp.UpdateProfile();
		System.out.println(CyanClr + "Profile updated successfully." + NormalClr);
	 	  
	    
	
	
	
	
  }
}
