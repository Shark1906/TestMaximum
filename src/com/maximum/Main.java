package com.maximum;

public class Main {
	
	public static void main(String[] args) {
		//Test Case 2.1
			TestMaximum maximum1 = new TestMaximum(30f, 15f, 20f);
			maximum1.returnMax();
			System.out.println(maximum1);
		
		//Test Case 2.2
			TestMaximum maximum2 = new TestMaximum(15f, 45f, 20f);
			maximum2.returnMax();
			System.out.println(maximum2);
				
		//Test Case 2.3
			TestMaximum maximum3 = new TestMaximum(30f, 15f, 55f);
			maximum3.returnMax();
			System.out.println(maximum3);
		
	}

}
