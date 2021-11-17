package com.maximum;

public class TestMaximum<E extends Comparable<E>> {
	
	private E obj1;
	private E obj2;
	private E obj3;
	private E max;
	
	public TestMaximum(E obj1, E obj2, E obj3) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public E returnMax() {
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
		return "Maximum Value = " + max;
	}
}
