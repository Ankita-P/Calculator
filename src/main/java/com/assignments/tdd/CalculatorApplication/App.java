package com.assignments.tdd.CalculatorApplication;

import java.util.Scanner;

public class App 
{
	public static int inputNumberOne = 0;
	public static int inputNumberTwo = 0;
	public static int operationResult = 0;
	public static int operationSelected = 0;
	static Calculator calculator;
	
	public static void main(String[] args) {
		showListOfOperations();
	}
	
	public static void getSingleNumberUserInput()
	{
		Scanner inputEntered = new Scanner(System.in);
		System.out.println("Enter first number for performing operation : ");
		inputNumberOne = Integer.parseInt(inputEntered.nextLine());
		inputEntered.close();
		
		inputNumberTwo = 0;
	}
	
	public static void getDoubleNumberUserInput()
	{
		Scanner inputEntered = new Scanner(System.in);
		System.out.println("Enter first number for performing operation : ");
		inputNumberOne = Integer.parseInt(inputEntered.nextLine());
		
		System.out.println("Enter second number for performing operation : ");
		inputNumberTwo = Integer.parseInt(inputEntered.nextLine());
		inputEntered.close();
	}
	
	public static void showListOfOperations()
	{
		System.out.println("Select operation to perform : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		
		System.out.println("Select operation to perform : ");
		Scanner inputEntered = new Scanner(System.in);
		operationSelected = Integer.parseInt(inputEntered.nextLine());
		inputEntered.close();
		
		switch(operationSelected)
		{
		case 1 :
				getDoubleNumberUserInput();
				calculator = new Calculator(inputNumberOne, inputNumberTwo);
				operationResult = calculator.add();
				break;
				
		case 2 :
			getDoubleNumberUserInput();
			calculator = new Calculator(inputNumberOne, inputNumberTwo);
			operationResult = calculator.subtract();
			break;
			
		case 3 :
			getDoubleNumberUserInput();
			calculator = new Calculator(inputNumberOne, inputNumberTwo);
			operationResult = calculator.multiply();
			break;
			
		case 4 :
			getDoubleNumberUserInput();
			calculator = new Calculator(inputNumberOne, inputNumberTwo);
			operationResult = calculator.divide();
			break;
			
		case 5 :
			getSingleNumberUserInput();
			calculator = new Calculator(inputNumberOne, inputNumberTwo);
			operationResult = calculator.modulus();
			break;
			
		default:
			 break;
				
		}
		printOutput();
	}
	
	public static void printOutput()
	{
		System.out.println("Output of operation is : "+operationResult);
	}

}
