package task1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a positive integer: ");
	        int number = scanner.nextInt();
	        
	        if (number <= 0) {
	            System.out.println("Please enter a positive integer.");
	            return;
	        }
	        
	        System.out.println("Multiplication table of " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	        
	        scanner.close();

	}

}
