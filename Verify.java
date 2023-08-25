package controlStructures;

import java.util.Scanner;

public class Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=1234;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the pin: ");
        int pin = scanner.nextInt();
        if(pin==y) {
        	System.out.println("Matching pin");
        }
        else {
        	System.out.println("Incorrent pin");
        	
        }
	}
	

}
