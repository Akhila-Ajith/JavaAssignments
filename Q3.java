package Encapsulation;

import java.util.Scanner;


public class Q3 {
	static Customer[] cust=new Customer[5];
	static int count=0;
	static int i=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		char choice='n';
		do {
			System.out.println("Welcome");
			System.out.println("Enter your choice");
			System.out.println("1.Add Details");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Exit");
			int inp=Integer.parseInt(scan.nextLine());
			if(inp==1) {
				userinput();
			}
			else if(inp==2) {
				displayCust();
			}
			else if(inp==3) {
				searchcust();
			}
			else {
				exitApp();
			}
			System.out.println("Do you want to continue?(y/n)");
			choice=scan.nextLine().charAt(0);
		}while (choice=='Y'||choice=='y');
	}
	private static void searchcust() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Account number");
		long temp=scan.nextLong();
		for(int j=0;j<count;j++) {
			if(cust[j].accno==temp)
			{
				System.out.println("Account exists! Account Holder: "+cust[j].name);
			}
		}
		
	}
	private static void exitApp() {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	private static void displayCust() {
		// TODO Auto-generated method stub
		System.out.println("The employee details are : ");
		for(int i=0;i<count;i++) {
			System.out.println("Details of Customer "+i+"\n");
			System.out.println("Customer name : "+cust[i].name);
			System.out.println("Customer address : "+cust[i].address);
			System.out.println("Customer age : "+cust[i].age);
			System.out.println("Account  number : "+cust[i].accno);
			System.out.println("Account  type : "+cust[i].acctype);
		
		}
	}
	private static void userinput() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
			for(i=0;i<5;i++) {
			Customer cus=new Customer();
			System.out.println("Enter the name of the Customer");
			cus.name=scan.next();
			System.out.println("Enter Age");
			cus.age=scan.nextInt();
			System.out.println("Enter Address");
			cus.address=scan.next();
			System.out.println("Enter Account number");
			cus.accno=scan.nextLong();
			System.out.println("Enter Account type");
			cus.acctype=scan.next();
			cust[i]=cus;
			count++;}
			
			
	}

}
