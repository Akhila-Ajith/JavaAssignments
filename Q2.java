package Strings;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter character");
		char c=scan.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("Character is a vowel");
		else
			System.out.println("Character is a Consonant");
		scan.close();
	}

}
