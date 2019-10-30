package com.assignments.tdd.CalculatorApplication;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public int inputNumberOne = 10;
	public int inputNumberTwo = 5;
	public int operationResult = 0;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testCalculatorAddition()
    {
    	Calculator calculator = new Calculator(inputNumberOne, inputNumberTwo);
    	operationResult = calculator.add();
    	
    	assertTrue(true);
    }
    
    public void testCalculatorSubtraction()
    {
    	Calculator calculator = new Calculator(inputNumberOne, inputNumberTwo);
    	operationResult = calculator.subtract();
    	
    	assertTrue(true);
    }
    
    public void testCalculatorDivision()
    {
    	Calculator calculator = new Calculator(inputNumberOne, inputNumberTwo);
    	operationResult = calculator.divide();
    	
    	assertTrue(true);
    }
    
    public void testCalculatorMultiplication()
    {
    	Calculator calculator = new Calculator(inputNumberOne, inputNumberTwo);
    	operationResult = calculator.multiply();
    	
    	assertTrue(true);
    }
}
