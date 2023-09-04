package Interface;

public class Square implements Shape {
	private int side;
	
	
	public Square(int side) {
		super();
		this.side = side;
	}


	@Override
	public void area() {
		System.out.println("Area of square = "+(side*side));
		
	}

}
