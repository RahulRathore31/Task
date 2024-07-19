package task1;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = scanner.nextInt();

	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num = num / 10;
	        }

	        System.out.println("Reversed number: " + reversedNum);

	        scanner.close();

	}

}
