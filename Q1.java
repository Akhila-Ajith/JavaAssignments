package Polymorphism;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rectangle = new Rectangle(5.0, 4.0);
	        Square square = new Square(3.0);

	        System.out.println("Area of Rectangle:");
	        calculateArea(rectangle);

	        System.out.println("Area of Square:");
	        calculateArea(square);
	}
	public static void calculateArea(Shape s) {
        double area = s.area();
        System.out.println("Area: " + area);
    }
}