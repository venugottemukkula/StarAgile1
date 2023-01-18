package calculatorApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorMainTest {
	
	private CalculatorMain objCalcUnderTest;

	@Before
	public void setUp() {
	//Arrange
	objCalcUnderTest = new CalculatorMain();
	}

	@Test
	public void testAdd() { 
	int a = 15; int b = 20; 
	int expectedResult = 35;
	long result = objCalcUnderTest.sum(a, b);
	assertEquals(expectedResult, result);
	}
	
	@Test
	public void testSubtract() { 
	int a = 25; int b = 20; 
	int expectedResult = 5;
	long result = objCalcUnderTest.subtraction(a, b);
	assertEquals(expectedResult, result);
	}
	
	@Test
	public void testMultiply() { 
	int a = 30; int b = 20; 
	int expectedResult = 600;
	long result = objCalcUnderTest.multiplication(a, b);
	assertEquals(expectedResult, result);
	}
	@Test
	public void testDivide() { 
	int a = 50; int b = 2; 
	int expectedResult = 25;
	long result = objCalcUnderTest.division(a, b);
	assertEquals(expectedResult, result);
	}

}
