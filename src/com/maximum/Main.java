package com.maximum;

public class Main {
	
	public static void main(String[] args) {
		//Test Case 3.1
			TestMaximum maximum1 = new TestMaximum("AmanZ", "AmanB", "AmanG");
			maximum1.returnMax();
			System.out.println(maximum1);
		
		//Test Case 3.2
			TestMaximum maximum2 = new TestMaximum("AmanS", "AmanT", "AmanK");
			maximum2.returnMax();
			System.out.println(maximum2);
				
		//Test Case 3.3
			TestMaximum maximum3 = new TestMaximum("AmanD", "AmanN", "AmanP");
			maximum3.returnMax();
			System.out.println(maximum3);
		
	}

}
