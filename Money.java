package Inheritance;

import java.util.Date;

public class Money {
	private int basicFee=1200;

	public int getTotalFee(Date doj) {
		Date date = new Date();
		long noOfYears = ((date.getTime()-doj.getTime()) / (1000l * 60 * 60 * 24 * 365));
		int totalFee = (int) ((basicFee+50)*noOfYears);
		return totalFee;
	}
		
	}
