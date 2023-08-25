package variablesAndDatatypes;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	float a = 0.0f;
	        float b = 0.0f;
	        float quo=0.0f;
	        float rem=0.0f; 		
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter first number");
	        a=input.nextInt();
	        System.out.println("Enter second number");
	        b=input.nextInt();
	        quo=a/b;
	        rem=a%b;
	        System.out.println("Quotient is "+quo);
	        System.out.println("Remainder is "+rem);
	}

}
