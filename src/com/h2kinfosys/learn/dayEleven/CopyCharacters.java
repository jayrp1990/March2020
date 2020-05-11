package com.h2kinfosys.learn.dayEleven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) throws IOException {
		FileReader fRead = null;
		FileWriter fWrite = null;
		String filePath = "/RISHI/H2K/FileIO/";
		String fileName = "CustomerWatchTime.txt";
		String output = "charOutfile.txt";
		try {
			fRead = new FileReader(filePath+fileName);
			fWrite = new FileWriter(filePath+output);
			int byteData;
			// -1 represents EOF
			while((byteData = fRead.read()) != -1) {
				System.out.println(byteData);
				fWrite.write(byteData); // writing the data 
			}
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}finally {
			if(fRead != null) fRead.close();
			if(fWrite != null) fWrite.close();
		}

	}

}
