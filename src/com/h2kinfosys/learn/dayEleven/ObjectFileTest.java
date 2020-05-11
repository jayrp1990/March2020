package com.h2kinfosys.learn.dayEleven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectFileTest {

	public static void main(String[] args) throws IOException {
		Store store121 = new Store();
		store121.setStoreId(121);
		store121.setStoreName("Cumberland Store");
		store121.setStoreZipcode("30339");


		FileInputStream fin = null;
		FileOutputStream fout = null;
		String filePath = "/RISHI/H2K/FileIO/";
		String fileName = "Store121.obj";
		
		ObjectInputStream objIn = null;
		ObjectOutputStream objOut = null;
		
		try {
			fin = new FileInputStream(filePath+fileName);
			fout = new FileOutputStream(filePath+fileName);
			
			objOut = new ObjectOutputStream(fout);
			objOut.writeObject(store121);
			System.out.println("Object is Written in Disk");
			
			objIn = new ObjectInputStream(fin);
			Object object  = objIn.readObject();
			
			if(object instanceof Store) {
				Store store =  (Store) object;
				System.out.println(store.getStoreId());
				System.out.println(store.getStoreName());
				System.out.println(store.getStoreZipcode());
			}
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fin != null) fin.close();
			if(fout != null) fout.close();
			if(objOut != null) objOut.close();
			if(objIn != null) objIn.close();
			
		}

	

	}

}
