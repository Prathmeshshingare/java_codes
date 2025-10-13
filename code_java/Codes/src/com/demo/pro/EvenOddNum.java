package com.demo.pro;

public class EvenOddNum {
	
	public void findEvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("odd number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddNum eon=new EvenOddNum();
		eon.findEvenOdd(23);
		

	
	}
}
