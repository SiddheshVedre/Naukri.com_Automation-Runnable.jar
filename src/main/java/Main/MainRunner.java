package Main;

import java.time.LocalDate;
import java.util.Scanner;

import BasePackage.SeleniumSetup;
import Script.NaukriDailyUpdate;
import Script.NaukriJobApplications;

public class MainRunner extends SeleniumSetup {
	
	public static void main(String [] args) throws Exception  {
		
		//--------------------------------------------------------------------------------------------//
	     // Author and Today's Date
		
		System.out.println( "Script Start Running : by Siddhesh Vedre" );
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear());
		
		//--------------------------------------------------------------------------------------------//
	     // User Input Data
		
		System.out.println(BlueClr + "Naukri Daily Update Profile Started.... \n"  + NormalClr);
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println(BlueClr + "Enter Your Naukri.com Email id/Username : " + NormalClr);
		String Username = sc.nextLine();
		
		System.out.println(BlueClr + "Enter Your Naukri.com Password : " + NormalClr);
		String Password = sc.nextLine();
		
        System.out.println(BlueClr + "Please Provide Job Application Details here :" + NormalClr);
		
		System.out.println("Enter keyword / designation / companies : ");
		String designation = sc.nextLine();	
		
		System.out.println("Enter location : ");
		String jobLocationclick = sc.nextLine();
		
		System.out.println("Enter experience(If Fresher enter 0) :");
		String experience = sc.nextLine(); 
		
		System.out.println("How Many Job Application you want to Open and Apply? (enter only numbers : more then 0 - less than 50");
		String applications = sc.nextLine();
		
		
		
		//--------------------------------------------------------------------------------------------//
		 //Script 1

		SeleniumSetup.Selenium(Username, Password);
		NaukriDailyUpdate Ndu = new NaukriDailyUpdate();
		Ndu.NaukriProfileUpdate();
		driver.quit();
		System.out.println(GreenClr + "Profile Update Completed Successfully!" + NormalClr);
		
		
		//--------------------------------------------------------------------------------------------//
		 // Script 2
		SeleniumSetup.Selenium(Username, Password);
		NaukriJobApplications.JobApplications(designation, jobLocationclick, experience,applications);
		
		
		
		
		
		
        
		
		
  }
}


