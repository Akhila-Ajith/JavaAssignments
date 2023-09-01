package Encapsulation;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your type of account:");
		System.out.println("1.Fixed 2.Savings");
		int ch = scan.nextInt();
		Account a = new Account();
		System.out.println("Enter the principal:");
		a.setPrincipal(Double.parseDouble(scan.next()));
		System.out.println("Enter the time:");
		a.setTime(Integer.parseInt(scan.next()));
		if(ch==1)
		{
			a.setRate(11);
		}
		else
		{
			a.setRate(4);
		}
		
		a.calculateInterest();
	}

}
