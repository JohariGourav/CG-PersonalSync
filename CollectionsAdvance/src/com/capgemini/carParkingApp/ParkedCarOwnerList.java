package com.capgemini.carParkingApp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ParkedCarOwnerList {
	
	Map<ParkedCarLocation, ParkedCarOwnerDetails> map = new HashMap<>();
	
	
	public int addNewCar(ParkedCarLocation obj1, ParkedCarOwnerDetails obj2) {
		map.put(obj1, obj2);
		if(map.containsValue(obj2)) 
			return 1;
		else 
			return 0;
	}
	
	public void removeCar(ParkedCarLocation token) {

		map.remove(token);
	}
	
	public void getParkedCarLocation(ParkedCarLocation token) {
		if(map.get(token) != null) 
			System.out.println(map.get(token) );
		else
			System.out.println("Parking location is empty");
	}
}
