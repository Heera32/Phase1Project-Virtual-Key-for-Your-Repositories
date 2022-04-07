package com.lockedme.lockers;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class Directory {
	
	private ArrayList<File> files = new ArrayList<File>();
	public static final String rootDir="D:\\java\\Java_programs\\Phase1Project-Virtual Key for Your Repositories\\FileFolder\\";
	Path path = FileSystems.getDefault().getPath(rootDir).toAbsolutePath();
	
	public static void checkdirectory(String directoryName) {
		
		File file = new File(directoryName);
			if (!file.exists()) {
				file.mkdirs();
			}
		}
	

	public void showDirectoryContents() {
		
		checkdirectory("FileFolder");
		Boolean flag=getFiles().isEmpty();
		if(flag==false)
		{
			System.out.println("Filenames in ascending order");
			System.out.println("---------------------------------------");
			for (File file : getFiles())
			{
				System.out.println(file.getName());
			}	
			
		}else {System.out.println("Sorry!! Empty Directory!!");}
	}
 
      public ArrayList<File> getFiles() {
    	 
        File filefolder= new File(rootDir);
        File[] directoryFiles=filefolder.listFiles(); 
         files.clear();
      	  for (int i = 0; i < directoryFiles.length; i++) {
      		if (directoryFiles[i].isFile()||directoryFiles[i].isDirectory()) {
      			files.add(directoryFiles[i]);
      		}
      	}
      	Collections.sort(files);
		return files;
      }     		
}			
			
