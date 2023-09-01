package Strings;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scan.nextLine();
		System.out.println(s.replace("is", "is not"));
		scan.close();
	}

}
