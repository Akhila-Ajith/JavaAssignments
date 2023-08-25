package variablesAndDatatypes;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 0.0f; 		
		Scanner input=new Scanner(System.in);
        System.out.println("Enter the salary");
        salary=input.nextInt();
        double a=salary*0.4;
        double b=salary*0.2;
        salary=salary+a+b;
        System.out.println("Total Salary" +salary);
	}

}
