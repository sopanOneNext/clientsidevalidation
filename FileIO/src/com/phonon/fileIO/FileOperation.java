package com.phonon.fileIO;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	
	public static void main(String args[]) throws IOException {
	     
		  File filePath = new File("D:\\resume");
	      String contents[] = filePath.list();
	      File filesList[] = filePath.listFiles();
	      
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	      }
	      
	      for(File file : filesList) {
	          System.out.println("File path: "+file.getAbsolutePath());
	          System.out.println("check directory: "+file.isDirectory());
	          System.out.println("can we write: "+file.canWrite());
	          System.out.println("can we read: "+file.canRead());
	          System.out.println("can we create new file: "+file.createNewFile());
	          System.out.println("can we delete: "+file.delete());
	          System.out.println("is excutable: "+file.canExecute());
	          System.out.println("modified on dated: "+file.lastModified());
	          
	          System.out.println(" ");
	       }
	   }

}
