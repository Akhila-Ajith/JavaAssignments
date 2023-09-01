package Encapsulation;

import java.util.Scanner;

public class ReportGenerator {
	static Item[] itemDetails = new Item[5];
	static int i=0;
	static char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				
				do
				{
					Item obj = new Item();
				System.out.println("Enter the item number:");
				obj.setItemNo(Integer.parseInt(scan.nextLine()));
				System.out.println("Enter the item name:");
				obj.setItemName(scan.nextLine());
				System.out.println("Enter the price:");
				obj.setPrice(Integer.parseInt(scan.nextLine()));
				itemDetails[i++]=obj;
				System.out.println("Do you want to continue?(Y/N):");
				ch=scan.nextLine().charAt(0);
				}while(ch=='y' || ch=='Y');
				
				System.out.println("Displaying details.......");
				for(Item it:itemDetails)
				{
					System.out.println(it);
				}
			}
	}
