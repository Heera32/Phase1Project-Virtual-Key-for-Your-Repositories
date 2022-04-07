package com.lockedme.lockers;

public class welcomeScreen {

	String applicationName;
	String developerName;

	public void displayWelcomeMessage(String applicationName, String developerName) {
		
		System.out.println("\n------------Welcome to " + applicationName +"--------------");
		System.out.println("This application was desgined and developed by "+developerName);
		System.out.println("\n**********************************************************  \n\n");
		System.out.println("‘Lockers.lockedMe’ application will help you to handle your files in an easy way!!"+"\n"+" Please go through the actions you can perform here:-");		
	}
	
	public void displayMainMenu() {
		
		System.out.println("\n1. Show file names.");
		System.out.println("2. Go for any file operations.");
		System.out.println("3. Exit the application.\n");
		System.out.println("----------Make your choice:----------\n");
	}
	
	public void displayFileMenu() {
		
		System.out.println("\n1. Add a File");
		System.out.println("2. Delete a File");
		System.out.println("3. Search for a File");
		System.out.println("4. Return to Main menu");
		System.out.println("----------Please choose the required file operation:----------\n");	
	}
	
	
	
}
