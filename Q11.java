package controlStructures;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the train id : ");
		String id = scan.nextLine();
		System.out.println("Enter the train name: ");
		String tName = scan.nextLine();
		System.out.println("Enter the passenger name: ");
		String pName = scan.nextLine();
		SeatReservation s1 = new SeatReservation(id,tName,pName);
		System.out.println(s1.getReservation());
		scan.close();
	}

}
