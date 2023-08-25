package variablesAndDatatypes;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 0.0f; 		
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the distance in KM");
        a=input.nextInt();
        System.out.println("Entered distance in meters= "+(a*1000));
        System.out.println("Entered distance in feet="+(a*3280.84));
        System.out.println("Entered distance in inches="+(a*39370.07874));
        System.out.println("Entered distance in meters= "+(a*100000));
        

	}

}
