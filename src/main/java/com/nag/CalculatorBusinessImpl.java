package com.nag;

public class CalculatorBusinessImpl {
	
	
	public String isEven(int n)
	{
		if(n%2 == 0)
			return n+" is an even number";
		else
			return n+" is an odd number";
	}

	
	public String isDivisbleBy10(int n)
	{
		if(n%10 == 0)
			return n+" is divisible by 10";
		else
			return n+" is not divisible by 10";
	}
	
	public String isDivisbleBy5(int n)
	{
		if(n%5 == 0)
			return n+" is divisible by 5";
		else
			return n+" is not divisible by 5";
	}
	
}
