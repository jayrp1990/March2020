package com.h2kinfosys.learn.dayEleven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		String filePath = "/RISHI/H2K/FileIO/";
		String fileName = "CustomerWatchTime.txt";
		String output = "byteOutfile.txt";
		try {
			fin = new FileInputStream(filePath+fileName);
			fout = new FileOutputStream(filePath+output);
			int byteData;
			// -1 represents EOF
			while((byteData = fin.read()) != -1) {
				System.out.println(byteData);
				fout.write(byteData); // writing the data 
			}
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}finally {
			if(fin != null) fin.close();
			if(fout != null) fout.close();
		}

	}

}
