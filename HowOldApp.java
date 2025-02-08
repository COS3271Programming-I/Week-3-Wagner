package main;

import java.util.Scanner;

public class HowOldApp {

	public static void main(String[]args) {
	String x;
	int age;
	Scanner userInput = new Scanner(System.in);
	
	
	{
			
			System.out.print("How old are you?");
			x = userInput.nextLine();
			
			age = Integer.parseInt(x);
			int futureAge = age + 5;
			System.out.println("In 5 years you will be " + futureAge + " years old.");
			
			boolean Teenager = age > 12 && age < 20;
			System.out.println("It is " + Teenager +" that you are a teenager");
					
			System.out.println("I am such a smart computer.");
			
			userInput.close();
	}
}
	}
