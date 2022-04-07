package com.lockedme.lockers;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectOperation {
	
	Directory directory = new Directory();
	welcomeScreen welcomeScreen = new welcomeScreen();
	
	private int userChoice() {
	    int  choice= 0;
        Scanner sc = new Scanner(System.in);
        try {
        	choice = sc.nextInt();
        }
        catch (InputMismatchException ex) {
        }
        return choice;
    }
	//redirecting to the execution part based on user inputs
	public void mainMenuChoosingFunction() {
		while(true) {
			welcomeScreen.displayMainMenu();
		
			switch(userChoice()) {
			case 1:
				directory.showDirectoryContents();
				break;
			case 2:
				fileMenuChoosingFunction();
				break;
			case 3:
				System.out.println("Program exited successfully.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice.");
			}	
	}
	}
	
	
	public void fileMenuChoosingFunction() {
		FileManipulation fileManipulation=new FileManipulation();
		
		while(true) {
			welcomeScreen.displayFileMenu();
			
				switch(userChoice()) {
				case 1:
					fileManipulation.addFile();
					break;
				case 2:
					fileManipulation.deleteFile();
					break;
				case 3:
					fileManipulation.searchFile();
					break;
					
				case 4: 
					mainMenuChoosingFunction();
	                break;
	                
	            default:
					System.out.println("Invalid choice.");
				}		
		}	
	}
		
}
