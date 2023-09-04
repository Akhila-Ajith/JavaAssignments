package Abstraction;

public class Goat extends Animal{
	int noOfLegs;
	String color;
	public Goat(int noOfLegs, String color) {
		super();
		this.noOfLegs = noOfLegs;
		this.color = color;
	}
	@Override
	public void Saysomething() {
		// TODO Auto-generated method stub
		System.out.println("Goat says meh");
	}
	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Meh";
	}
	@Override
	public float fly() {
		// TODO Auto-generated method stub
		return 0.0f;
	}
	@Override
	public int walk() {
		// TODO Auto-generated method stub
		return noOfLegs;
	}

}
