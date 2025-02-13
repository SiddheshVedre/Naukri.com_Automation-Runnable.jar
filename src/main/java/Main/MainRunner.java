package Main;

import java.util.Scanner;

import Script.NaukriDailyUpdate;

public class MainRunner {
	
	
	//>>>>>>>>>>>>>>>>> Text Colours <<<<<<<<<<<<<<<<<
	private static String NormalClr = "\u001B[0m";
	private static String  BlueClr = "\u001B[33m";
	public static String RedClr = "\u001B[31m";
	
	
	
	
	public static void main(String [] args) throws Exception {
		
		System.out.println( "Script Start Running : by Siddhesh Vedre" );
		
		System.out.println(BlueClr + "Naukri Daily Update Profile Started.... \n"  + NormalClr);
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println(BlueClr + "Enter Your Naukri.com Email id/Username : " + NormalClr);
		String Username = sc.nextLine();
		
		System.out.println(BlueClr + "Enter Your Naukri.com Password : " + NormalClr);
		String Password = sc.nextLine();
		
		
		
		
		
		NaukriDailyUpdate DUpdate = new NaukriDailyUpdate();
		
		
		DUpdate.NaukriProfileUpdate(Username, Password);
		System.out.println("Profile Update Completed Successfully!");
        
		
		
  }
}


