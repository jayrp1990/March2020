package com.h2kinfosys.learn.dayEleven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		String filePath = "/RISHI/H2K/FileIO/";
		String fileName = "TestFile.txt";
		String secondFile = "SecondFile.txt";
		try {
			File file = new File(filePath+fileName);
			File dest = new File(filePath + secondFile);
			if(file.exists()) {
				System.out.println("File Already Exists");
			}else {
				file.createNewFile(); // creating a new file
				System.out.println(fileName + " File created");
			}
			if(file.isFile()) {
				System.out.println(file.getName() + " is a File ");			
			}
			
			if(!dest.exists()) {
				dest.createNewFile();
			}
			System.out.println("Permissions :: ");
			System.out.println("file.canExecute() :: " + file.canExecute());
			System.out.println("file.canRead() :: " + file.canRead());
			System.out.println("file.canWrite() :: " + file.canWrite());
			
			System.out.println("Different File Paths provided :: ");
			System.out.println("file.getPath() :: " + file.getPath());
			System.out.println("file.getAbsolutePath() :: " + file.getAbsolutePath());
			System.out.println("file.getCanonicalPath() :: " + file.getCanonicalPath());
			System.out.println("file.getName() :: " + file.getName());
			System.out.println("file.getParent() :: " + file.getParent());
			
			File dir = new File(filePath);
			if(dir.isDirectory()) {
				System.out.println(dir.getName() + " is a directory");
			}
			String newDir = filePath + "test"; 
			File newDirFile = new File(newDir);
			if(newDirFile.exists()) {
				System.out.println("File Exists");
			}else {
				newDirFile.mkdir();
			}
			
			File[] allFilesFromDir = dir.listFiles();
			
			for(File eachFile : allFilesFromDir) {
				System.out.println(eachFile.getName());
			}
			// Ctrl+c - making a copy of file
			file.renameTo(new File(filePath + secondFile));
			
			newDirFile.delete();
			file.deleteOnExit();
			System.out.println("New Files Deleted");
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}

}
