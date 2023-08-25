package variablesAndDatatypes;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahrenheit = 0.0f; 		
        float celsius=0.0f;
		Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        fahrenheit=input.nextInt();
        celsius=(fahrenheit-32)*5/9;
        System.out.println("Temperature in celsius is "+celsius );
        
        
	}

}
