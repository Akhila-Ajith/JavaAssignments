package Inheritance;

public class BankA extends Bank{
	 public double calculateSimpleInterest(double principal, double rate, double time) {
	        return super.calculateSimpleInterest(principal, 10.0, time);
	    }
}