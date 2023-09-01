package Polymorphism;

public class Rectangle1 extends Figure{
	public Rectangle1(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	
	public float area() {
		return dim1*dim2;
	}

}
