package com.nag;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalculatorBusinessImpl impl = new CalculatorBusinessImpl();
		String str = impl.isEven(5);
		System.out.println(str);
		
		
	}

}
