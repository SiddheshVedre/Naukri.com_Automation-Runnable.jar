package Script;

import java.io.IOException;
import java.util.Scanner;

import BasePackage.SeleniumSetup;
import PagesAndAutomationWork.HomePage;
import PagesAndAutomationWork.LoginPage;
import PagesAndAutomationWork.ProfilePage;



public class NaukriBasicAutomation extends SeleniumSetup {

	public static void main(String[] args) throws IOException {

		System.out.println("Script Start Running : by Siddhesh Vedre");
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Email id/Username : ");
		String Username = sc.nextLine();
		
		System.out.println("Enter Your Password : ");
		String Password = sc.nextLine();
		
		SeleniumSetup Sp = new SeleniumSetup();
		Sp.Selenium();
		
	//Classes Added here
		LoginPage Lp = new LoginPage(driver);
		HomePage Hp = new HomePage(driver);
		ProfilePage Pp = new ProfilePage(driver);
		
   //Steps For Automate Profile Update
		Lp.NaukriLogin(Username, Password);
		Hp.clickonProfile();
		Pp.UpdateProfile();
		
		
	
		System.out.println("\u001B[32m" + "Profile Update Properly" + "\u001B[0m");
		driver.quit();

			

	}

}
