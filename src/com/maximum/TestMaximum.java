package com.maximum;

public class TestMaximum {
	
	
	
	public static <E extends Comparable<E>> E returnMax(E obj1, E obj2, E obj3) {
		
		E max=null;
		if(obj1.compareTo(obj2) > 0){
			max = obj1; 
		}
		else if(obj1.compareTo(obj2) < 0) {
			max = obj2;
		}
		if(max.compareTo(obj3) < 0) {
			max = obj3;
		}
		return max;
	}
}
