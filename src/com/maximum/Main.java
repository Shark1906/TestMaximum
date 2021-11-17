package com.maximum;

public class Main {
	
	public static void main(String[] args) {
		
		TestMaximum maximum = new TestMaximum();
		
		//Test Case 3.1			
			System.out.println("Maximum value : " + maximum.returnMax("AmanZ", "AmanB", "AmanG"));
		
		//Test Case 3.2
			System.out.println("Maximum value : " + maximum.returnMax(12,24,21));
				
		//Test Case 3.3
			System.out.println("Maximum value : " + maximum.returnMax(25f, 45f, 51f));
		
	}

}
