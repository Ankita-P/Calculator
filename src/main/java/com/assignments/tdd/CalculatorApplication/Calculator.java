package com.assignments.tdd.CalculatorApplication;

public class Calculator {
	
	public int inputNumberOne = 0;
	public int inputNumberTwo = 0;
	public int calculationOutput = 0;
	public Calculator(int operationInputOne, int operationInputTwo)
	{
		this.inputNumberOne = operationInputOne;
		this.inputNumberTwo	= operationInputTwo;
	}
	
	public int add()
	{
		calculationOutput = this.inputNumberOne + this.inputNumberTwo;
		
		System.out.println("Result of addition is: "+calculationOutput);
		
		return calculationOutput;
	}
	
	public int subtract()
	{
		calculationOutput = this.inputNumberOne - this.inputNumberTwo;

		System.out.println("Result of subtraction is: "+calculationOutput);
		
		return calculationOutput;
	}
	
	public int multiply()
	{
		calculationOutput = this.inputNumberOne * this.inputNumberTwo;
		
		System.out.println("Result of multiplication is: "+calculationOutput);
		
		return calculationOutput;
	}
	
	public int divide()
	{
		calculationOutput = this.inputNumberOne / this.inputNumberTwo;
		
		System.out.println("Result of division is: "+calculationOutput);
		
		return calculationOutput;
	}
	
	public int modulus()
	{
		calculationOutput = this.inputNumberOne % 2;
		
		System.out.println("Result of modulus is: "+calculationOutput);
		
		return calculationOutput;
	}

}
