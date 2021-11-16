package com.maximum;

public class Main {
	
	public static void main(String[] args) {
		//Test Case 1.1
			TestMaximum maximum1 = new TestMaximum(30, 15, 20);
			maximum1.returnMax();
			System.out.println(maximum1);
		
		//Test Case 1.2
			TestMaximum maximum2 = new TestMaximum(15, 45, 20);
			maximum2.returnMax();
			System.out.println(maximum2);
				
		//Test Case 1.3
			TestMaximum maximum3 = new TestMaximum(30, 15, 55);
			maximum3.returnMax();
			System.out.println(maximum3);
		
	}

}
