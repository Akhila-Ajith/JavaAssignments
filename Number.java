package Interface;

public class Number implements Ifirst,Isecond {
	@Override
	public void display() {
		System.out.println("Display method");

	}

	@Override
	public int getValue() {
		return 9;

	}


	@Override
	
	public void demo() {
		System.out.println("Demo method in Isecond");

	}
}
