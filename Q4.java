package controlStructures;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for month : ");
		int month = scan.nextInt();
		String result = "NULL";
		switch(month){
			case 1:
			case 2:
			case 12:
				result="Winter";
				break;
			case 3:
			case 4:
			case 5:
				result="Spring";
				break;
			case 6:
			case 7:
			case 8:
				result="Summer";
				break;
			case 9:
			case 10:
			case 11:
				result="Autumn";
				break;
			default:
				result="None";
		}
		System.out.println("Season is "+result);
		scan.close();
	}

	}


