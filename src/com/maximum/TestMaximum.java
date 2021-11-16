package com.maximum;

public class TestMaximum {
	
	private String obj1;
	private String obj2;
	private String obj3;
	private String max;
	
	public TestMaximum(String obj1, String obj2, String obj3) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public String returnMax() {
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
	

	@Override
	public String toString() {
		return "Maximum String = " + max;
	}

}
