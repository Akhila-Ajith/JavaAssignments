package Inheritance;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car myCar = new Car("Red");

	        
	        String carBrand = myCar.brandName();
	        String carColor = myCar.color();

	        
	        System.out.println("Car Brand: " + carBrand);
	        System.out.println("Car Color: " + carColor);
	}

}
