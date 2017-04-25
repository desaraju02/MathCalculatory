package com.nag;

public class CalculatorBusinessImpl {
	
	
	public String isEven(int n)
	{
		if(n%2 == 0)
			return n+" is an even number";
		else
			return n+" is an odd number";
	}

}
