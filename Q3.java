package Inheritance;

import java.util.Date;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date(10,10,2020);
		Money m=new Money();
		Patient a=new Patient("Harry", "223434","harry123",1,"Lake Shore",date,
				"Godric's Hollow", 1000);
		System.out.println(a);
		int mon=a.getMedicalFee(m);
		System.out.println(mon);
	}

}
