package variablesAndDatatypes;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a five-digit number: ");
	        int number = scanner.nextInt();
	        
	        if (number < 10000 || number > 99999) {
	            System.out.println("Please enter a valid five-digit number.");
	        } else {
	            int sum = 0;
	            int temp = number;
	            
	            while (temp > 0) {
	                int digit = temp % 10;
	                sum += digit;
	                temp /= 10;
	            }
	            
	            System.out.println("Sum of the digits: " + sum);
	        }
	        
	        scanner.close();

	}

}
