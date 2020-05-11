package com.h2kinfosys.learn.dayEleven;

import java.io.Serializable;

public class Store implements Serializable {
	
	private String storeName;
	private int storeId;
	private String storeZipcode;
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreZipcode() {
		return storeZipcode;
	}
	public void setStoreZipcode(String storeZipcode) {
		this.storeZipcode = storeZipcode;
	}
	
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
