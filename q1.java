package variablesAndDatatypes;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 0;
	        int b = 0;
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter first number");
	        a=input.nextInt();
	        System.out.println("Enter second number");
	        b=input.nextInt();
	        System.out.println("Before swapping:");
	        System.out.println("num1 = " + a);
	        System.out.println("num2 = " + b);
	        
	        // Swapping without a third variable
	        a = a + b;
	        b = a- b;
	        a = a - b;
	        
	        System.out.println("After swapping:");
	        System.out.println("num1 = " + a);
	        System.out.println("num2 = " + b);
	}

}
