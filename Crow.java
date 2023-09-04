package Abstraction;

public class Crow extends Animal{
	int noOfLegs;
	String color;
	public Crow(int noOfLegs, String color) {
		super();
		this.noOfLegs = noOfLegs;
		this.color = color;
	}
	@Override
	public void Saysomething() {
		// TODO Auto-generated method stub
		System.out.println("Crow says craww");
	}
	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Craww";
	}
	@Override
	public float fly() {
		// TODO Auto-generated method stub
		return 20.0f;
	}
	@Override
	public int walk() {
		// TODO Auto-generated method stub
		return noOfLegs;
	}

}
