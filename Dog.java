package Abstraction;

public class Dog extends Animal{
	int noOfLegs;
	String color;
	
	public Dog(int noOfLegs, String color) {
		super();
		this.noOfLegs = noOfLegs;
		this.color = color;
	}

	@Override
	public void Saysomething() {
		// TODO Auto-generated method stub
		System.out.println("Dogs say bow bow ");
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "bow";
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
