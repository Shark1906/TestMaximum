package com.maximum;

public class Main {
	
	public static void main(String[] args) {
		//Test Case 3.1
			TestMaximum<String> maximum1 = new TestMaximum<String>("AmanZ", "AmanB", "AmanG");
			maximum1.returnMax();
			System.out.println(maximum1);
		
		//Test Case 3.2
			TestMaximum<Integer> maximum2 = new TestMaximum<Integer>(22, 56, 34);
			maximum2.returnMax();
			System.out.println(maximum2);
				
		//Test Case 3.3
			TestMaximum<Float> maximum3 = new TestMaximum<Float>(12f, 24f, 43f);
			maximum3.returnMax();
			System.out.println(maximum3);
	}
}
