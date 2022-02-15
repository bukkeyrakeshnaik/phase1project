package com.projectphase1;

public class LockedMe {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperation.createMainFolderIfNotPresent("main");
		
		MenuOption.printWelcomeScreen("Locker", "Rakesh");
		
		HandleOptions.handleWelcomeScreenInput();
	}
}
