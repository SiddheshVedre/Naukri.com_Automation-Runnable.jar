package Script;

import java.io.IOException;

import BasePackage.SeleniumSetup;
import PagesAndAutomationWork.HomePage;
import PagesAndAutomationWork.JobSubmitingPage;

public class NaukriJobApplications extends SeleniumSetup {

	
	public static void JobApplications(String designation,String jobLocationclick, String  experience, String applications) throws IOException {

		//--------------------------------------------------------------------------------------------//
	     // Pages Structure 
		
		HomePage Hp = new HomePage(driver);
		JobSubmitingPage Jsp = new JobSubmitingPage(driver);
		
		//--------------------------------------------------------------------------------------------//
        //Steps For Automate: Open Job Applications
		
		Hp.SearchBar(designation, jobLocationclick, experience);
		System.out.println(CyanClr + "Search button click properly." + NormalClr);
		
		Hp.applications(Integer.parseInt(applications));
        Jsp.ApplyClick();
		
		
		
		
		
		
		
	}
	
}
