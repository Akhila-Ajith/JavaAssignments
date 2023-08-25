package controlStructures;

import java.util.Scanner;

public class Q3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for month : ");
		int month = scan.nextInt();
		String result = "NULL";
		if(month==1||month==2||month==12)
			result="Winter";
		else if(month==3||month==4||month==5)
			result="Spring";
		if(month==6||month==7||month==8)
			result="Summer";
		if(month==9||month==10||month==11)
			result="Autumn";
		System.out.println("Season is "+result);
	scan.close();
	}

	
}
