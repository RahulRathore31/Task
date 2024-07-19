package task1;

public class PrintRectangleasterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("RectangleAsterisks");
		  for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
		  		}
		  
		  System.out.print("Pattern");
		  for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
		  }
		  
	}
}