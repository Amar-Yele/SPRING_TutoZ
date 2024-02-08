package com.Collection.Standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobiles {
	
	private List<String> mobileNames;

	private Set<Integer> mobileNumbers;

	private Map<Integer, Integer> mobileStorage;
	
	@Override
	public String toString() {
		return "\n*****Mobiles Specifications**** :: \nMobile Names :: " + mobileNames + ", \nMobile Numbers :: " + mobileNumbers 
				+ ", \nMobile Storage ::"+ mobileStorage;
	}
	
	
	public List getMobileNames() {
		return mobileNames;
	}
	public void setMobileNames(List<String> mobileNames) {
		this.mobileNames = mobileNames;
	}
	public Set getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(Set<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public Map getMobileStorage() {
		return mobileStorage;
	}
	public void setMobileStorage(Map mobileStorage) {
		this.mobileStorage = mobileStorage;
	}

}
