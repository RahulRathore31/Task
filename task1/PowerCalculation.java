package task1;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent number: ");
        int exponent = scanner.nextInt();
        
        double result = 1;
        
        if (exponent >= 0) {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 1; i <= -exponent; i++) {
                result /= base;
            }
        }
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        scanner.close();
	}

}
