package Abstraction;

public class Cat extends Animal {
	int noOfLegs;
	String color;
	
	public Cat(int noOfLegs, String color) {
		super();
		this.noOfLegs = noOfLegs;
		this.color = color;
	}

	@Override
	public void Saysomething() {
		// TODO Auto-generated method stub
		System.out.println("Cat says meoow");
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Meow";
	}

	@Override
	public float fly() {
		// TODO Auto-generated method stub
		return 1.1f;
	}

	@Override
	public int walk() {
		// TODO Auto-generated method stub
		return noOfLegs;
	}
}
