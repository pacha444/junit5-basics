package io.javabrains;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathsUtilsTest {
	
	MathsUtils mathsUtils;
	@BeforeEach
	public void init ()
	{
	 mathsUtils=new MathsUtils();
	}

	@Test
	@DisplayName("addition method")
	void test() {
		
	
		int expected=2;
		int actual=mathsUtils.addition(1,1);
		assertEquals(expected, actual, "The add method should add two numbers");
	}
	
	@Test
	@DisplayName("multiply method")
	void testMultiply ()
	{
	
		assertAll(
				()->assertEquals(4,mathsUtils.multiplication(2, 2)),
				()->assertEquals(0,mathsUtils.multiplication(2, 0)),
				()->assertEquals(2,mathsUtils.multiplication(2, -1))
				);
	}
	
	@Test
	@DisplayName("Test Exception with assertThrows")
	void testDivide ()
	{
	
		assertThrows(ArithmeticException.class, ()->mathsUtils.division(1, 0), "Divide by zero should throw");
	}
	
	@Test
	@Tag("Circle")
	void testComputeCircleArea() {
		
		
		assertEquals(314,1519, mathsUtils.ComputeCircleArea(10), "Should return right circle area");
	}

}
