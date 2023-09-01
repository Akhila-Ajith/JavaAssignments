package Inheritance;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double principal = 1000.0; 
        double time = 2.0;

    
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        double interestA = bankA.calculateSimpleInterest(principal, 0.0, time);
        double interestB = bankB.calculateSimpleInterest(principal, 0.0, time);
        double interestC = bankC.calculateSimpleInterest(principal, 0.0, time);

        System.out.println("Simple Interest from Bank A: " + interestA);
        System.out.println("Simple Interest from Bank B: " + interestB);
        System.out.println("Simple Interest from Bank C: " + interestC);
        }
}