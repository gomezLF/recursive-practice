package model;

public class RecursiveFunctions {
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	
	public static int finonacci(int n) {
		if(n == 0) {
			return 0;
			
		}else if(n == 1) {
			return 1;
			
		}else {
			return finonacci(n-1) + finonacci(n-2);
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
