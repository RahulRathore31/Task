package task1;

public class Sumof10neturalnumbers {

	public static void main(String[] args) {
		int n = 10; 
        int sum = 0;
        
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
	}

}
