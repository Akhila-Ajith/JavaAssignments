package Abstraction;

public class Chicken extends Animal{
	int noOfLegs;
	String color;
	public Chicken(int noOfLegs, String color) {
		super();
		this.noOfLegs = noOfLegs;
		this.color = color;
	}
	@Override
	public void Saysomething() {
		// TODO Auto-generated method stub
		System.out.println("Chicken say bak bak");
	}
	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "bak bak";
	}
	@Override
	public float fly() {
		// TODO Auto-generated method stub
		return 2.5f;
	}
	@Override
	public int walk() {
		// TODO Auto-generated method stub
		return noOfLegs;
	}
	

}
