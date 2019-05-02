package model;

public class RecursiveFunctions {
	
	public static int factorial(int n) {
		return factorial(n, n);
	}
	
	private static int factorial(int n, int value) {
		if(n == 0) {
			return value;
			
		}else {
			return value*factorial(n-1, value);
		}
	}
	
	
	
	public static int finonacci(int n) {
		return finonacci(n, 1);
	}
	
	private static int finonacci(int n, int value) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
			
		}else {
			return value + finonacci(n-1, value);
		}
	}
	
	
	
	
	public static int arraySummatory(int[] array) {
		return arraySummary(array, array.length - 1);
	}
	
	private static int arraySummary(int[] array, int n) {
		if(n == 0) {
			return array[0];
			
		}else {
			return array[n] + arraySummary(array, n-1);
		}
	}
}
