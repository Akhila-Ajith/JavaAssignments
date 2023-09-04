package Abstraction;

public abstract class MyAnimal extends Animal{
	private int BodyTemp;

	public int getBodyTemp() {
		return BodyTemp;
	}

	public void setBodyTemp(int bodyTemp) {
		BodyTemp = bodyTemp;
	}
}
