package modelTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.RecursiveFunctions;

class RecursiveFunctionsTest {
	
	private int[] array;
	
	private void setupScenary1() {
		
	}
	
	private void setupScenary2() {
		array = new int[] {3, 5, 8, 10};
	}
	
	private void setupScenary3() {
		array = new int[] {10, 5, 10, 10};
	}
	
	private void setupScenary4() {
		array = new int[] {10, 5, 15, 10};
	}
	
	

	@Test
	void factorialTest() {
		setupScenary1();
		
		int result1 = 120;
		int result2 = 5040;
		int result3 = 720;
		
		assertEquals(result1, RecursiveFunctions.factorial(5));
		assertEquals(result2, RecursiveFunctions.factorial(7));
		assertEquals(result3, RecursiveFunctions.factorial(6));
		
	}
	
	@Test
	void finonacciTest() {
		setupScenary1();
		
		int result1 = 5;
		int result2 = 21;
		int result3 = 0;
		
		
		assertEquals(result1, RecursiveFunctions.finonacci(5));
		assertEquals(result2, RecursiveFunctions.finonacci(8));
		assertEquals(result3, RecursiveFunctions.finonacci(0));
	}
	
	@Test
	void arraySummatoryTest() {
		setupScenary2();
		
		int result1 = 26;
		
		assertEquals(result1, RecursiveFunctions.arraySummatory(array));
		
		setupScenary3();
		
		int result2 = 35;
		
		assertEquals(result2, RecursiveFunctions.arraySummatory(array));
		
		setupScenary4();
		
		int result3 = 40;
		
		assertEquals(result3, RecursiveFunctions.arraySummatory(array));
	}

}
