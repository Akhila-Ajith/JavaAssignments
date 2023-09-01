package Encapsulation;

public class Customer {
	public String name;
	public int age;
	public String address;
	public long accno;
	public String acctype;
	//default constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Name=" + name + ", age=" + age + ", address=" + address
				+ "Accno: "+accno+",Acctype: "+acctype+ "]";
	}
	
}
