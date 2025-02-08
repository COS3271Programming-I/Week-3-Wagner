package main;
import java.util.Scanner;
public class calculatorapp {
	

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your first number as (x):  ");
		double x = scanner.nextDouble();
	System.out.print("Enter your second number as (y):  ");
		double y = scanner.nextDouble();
		
		double sum = x + y;
		double multiply = x * y;
		double division = x / y;
		double power = Math.pow(x, y);
		double log = Math.log(x) / Math.log(y);
			
		System.out.println("x + y = " + sum);
		System.out.println("x * y = " + multiply);
		System.out.println("x / y = " + division);
		System.out.println("x ^ y = " + power);
		System.out.println("log base " + y + " of " + x + " = " + log);
		
		scanner.close();
	}
}
