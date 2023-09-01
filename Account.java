package Class_And_Objects;

public class Account {
	float balance;
Account(){
	 balance=0.0f;
}
public float Withdraw(float amount) {
	if(amount>balance)
		System.out.println("INSUFFICIENT BALANCE");
	else {
		   balance=balance-amount;
		System.out.println("Amount debited");
		}
	return balance;}
public float deposit(float amount) {
	balance=balance+amount;
	return balance;
}
}
