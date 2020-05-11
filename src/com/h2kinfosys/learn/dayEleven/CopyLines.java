package com.h2kinfosys.learn.dayEleven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		FileReader fRead = null;
		FileWriter fWrite1 = null;
		FileWriter fWrite2 = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		PrintWriter pWriter = null;
		
		String filePath = "/RISHI/H2K/FileIO/";
		String fileName = "CustomerWatchTime.txt";
		String output = "bufferOutfile.txt";
		String printOutput = "printWOutfile.txt";
		try {
			fRead = new FileReader(filePath+fileName);
			reader = new BufferedReader(fRead);
			
			fWrite1 = new FileWriter(filePath+output);
			writer = new BufferedWriter(fWrite1);
			
			fWrite2 = new FileWriter(filePath+printOutput);
			pWriter = new PrintWriter(fWrite2);
			
			String line;
			
			while((line= reader.readLine()) != null) {
				System.out.println(line);
				// writing the data
				writer.write(line);
				writer.newLine();
				// pWriter 
				//pWriter.write(line);
				pWriter.println(line);
			}
			writer.flush();
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}finally {
			if(fRead != null) fRead.close();
			if(fWrite1 != null) fWrite1.close();
			if(fWrite2 != null) fWrite2.close();
		}

	}

}
