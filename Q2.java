package Class_And_Objects;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		int opt=0;
		Scanner scan=new Scanner(System.in);
		do {
		System.out.println("Enter Option");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Exit");
		
		opt=scan.nextInt();
		if(opt==1) {
			System.out.println("Enter the amount to be credited");
			float amt=acc.deposit(scan.nextFloat());
			System.out.println("BALACE :"+amt);
		}
		else if(opt==2) {
			System.out.println("Enter the amount to be debited");
			float amt1=acc.Withdraw(scan.nextFloat());
			System.out.println("BALACE :"+amt1);
		}
	}while(opt!=3);
		scan.close();
}
}