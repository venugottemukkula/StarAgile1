package calculatorApp;

import java.util.Scanner;

public class CalculatorMain {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int result1 = sum(a,b);
		System.out.println(result1);
		
		int result2 = subtraction(a,b);
		System.out.println(result2);
		
		int result3 = multiplication(a,b);
		System.out.println(result3);
		
		int result4 = division(a,b);
		System.out.println(result4);
		

	}

	public static int division(int a, int b) {
		return a/b;
	}

	public static int multiplication(int a, int b) {
		return a*b;
	}

	public static int subtraction(int a, int b) {
		return a-b;
	}

	public static int sum(int a, int b) {
		return a+b;
	}

}
