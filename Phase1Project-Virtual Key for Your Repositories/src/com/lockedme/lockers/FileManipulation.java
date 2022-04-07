package com.lockedme.lockers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManipulation {
	static Scanner sc=new Scanner(System.in);
	private Directory dir = new Directory();
	private Boolean searchStatus = false;
	private File directory = new File(Directory.rootDir);
	
	public String getUserInput(String operation) {
		System.out.println("Please Enter the Filename to be "+operation);
        String fileName = sc.nextLine();
       
        if(fileName.isEmpty()||(fileName.startsWith(" "))) {
        	
        	System.out.println("Not a valid filename. Please choose another and continue."); 
        	return null;   	
        }else
        	
		return fileName;
	}
	public void addFile() {	
		Directory.checkdirectory("FileFolder");
		String fileName=getUserInput("added:");
        	 try {
        		 
        	 if(fileName!=null) {
     			File newfile = new File(Directory.rootDir + fileName);
     			if(newfile.exists()) {
     				System.out.println("Filename already exists!! No file created.");
     			}
     			else if(newfile.createNewFile()) 
     			{
     				 System.out.println("You are trying to add the file named:" +"'"+fileName+"'"+" in the path:-"+Directory.rootDir);
      		    	 System.out.println("File created: " + newfile.getName());
     		     }
        	 }	
        	}catch (IOException e){
     			System.out.println("Invalid..Please try again");
     		}	
        }   
	
        
	public void deleteFile() {
		
        String fileName=getUserInput("deleted:");
    	try {
    		if(fileName!=null){
    			if((directory.isDirectory())&&(searchForFile(fileName)==true)) {
               		System.out.println("You are trying to delete the file named:" +"'"+fileName+"'"+" in the path:-"+Directory.rootDir);
     		    	File newfile = new File(Directory.rootDir + fileName);
        			if(newfile.delete())
            			{
            				System.out.println(fileName+" Deleted successfully:");
            			}	
        		}else { 
        			System.out.println("File does not Exists!");
        			}
        		}
    		}catch (Exception e) {
        		System.out.println("Invalid..Please try again");
        	}	
    	}
    			
    		
      private Boolean searchForFile(String fileName) {
		
		searchStatus = false;
		String fileToSearch=fileName;
		ArrayList<File> files=dir.getFiles();
		for(int i = 0; i < files.size(); i++) {
			if(files.get(i).getName().equals(fileToSearch)) {
				searchStatus = true;
				}
        	}		
		return searchStatus;	
	}


	public void searchFile() {
		
	try {
		String fileName=getUserInput("searched:");
		if(fileName!=null){
    	searchStatus=searchForFile(fileName);
    	if((directory.isDirectory())&&(searchForFile(fileName)==true)) {
    		  System.out.println("File found");	
    	}
    	else{System.out.println("File not found");}
	  }
	}catch (Exception e) {
		System.out.println("Invalid file name");
	}
	}
}
