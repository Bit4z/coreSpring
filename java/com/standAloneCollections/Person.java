package com.standAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

public Properties getProperty() {
		return property;
	}


	public void setProperty(Properties property) {
		this.property = property;
	}

private List <String> friends;
private Map<String, Integer> feeStructure;
private Properties property;

@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + "]";
	}


public Map<String, Integer> getFeeStructure() {
	return feeStructure;
}

public void setFeeStructure(Map<String, Integer> feeStructure) {
	this.feeStructure = feeStructure;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}


public Object getProperty1() {
	// TODO Auto-generated method stub
	return null;
}

}
