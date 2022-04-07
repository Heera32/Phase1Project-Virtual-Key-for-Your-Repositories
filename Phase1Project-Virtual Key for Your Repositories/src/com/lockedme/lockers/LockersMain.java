package com.lockedme.lockers;

public class LockersMain {

	public static void main(String[] args) {
		
		welcomeScreen welcomeScreen = new welcomeScreen();
		welcomeScreen.displayWelcomeMessage("Lockers.LockedMe.com", "Heera P");
		SelectOperation selectOperation=new SelectOperation();
		selectOperation.mainMenuChoosingFunction();
	}

}
