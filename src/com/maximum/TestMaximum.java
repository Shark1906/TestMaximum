package com.maximum;

public class TestMaximum {
	
	private Integer num1;
	private Integer num2;
	private Integer num3;
	private Integer max;
	
	public TestMaximum(Integer num1, Integer num2, Integer num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public Integer returnMax() {
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
