package controlStructures;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		float bill;
		System.out.println("Enter your choice,1 for Domestic, 2 for Industrial ");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		System.out.println("Enter the units of electricity");
		float unit=scan.nextInt();
		switch(choice) {
			case 1: if(unit>=0 && unit<=100)
					bill=unit*1;
					 else if(unit>=100 && unit<=200)
					bill=(float) (unit*1.5);
					else if (unit>=200 && unit<=500)
						bill=unit*2;
					else
						bill=unit*5;
						System.out.println("The total bill amount is "+bill);
						break;
						
			case 2: bill=unit*10;
			System.out.println("The total bill amount is "+bill);
			break;
		}
	}

}
