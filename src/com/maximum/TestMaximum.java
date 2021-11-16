package com.maximum;

public class TestMaximum {
	
	private Float num1;
	private Float num2;
	private Float num3;
	private Float max;
	
	public TestMaximum(Float num1, Float num2, Float num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public Float returnMax() {
		if(num1.compareTo(num2) > 0){
			max = num1; 
		}
		else if(num1.compareTo(num2) < 0) {
			max = num2;
		}
		if(max.compareTo(num3) < 0) {
			max = num3;
		}
		return max;
	}
	

	@Override
	public String toString() {
		return "Maximum Number = " + max;
	}

}
