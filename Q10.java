package controlStructures;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter DOB");
		String dob=scan.nextLine();
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		System.out.println(date);
		System.out.println(date.getMonth());
	}

}
