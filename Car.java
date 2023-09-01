package Inheritance;

public class Car extends Vehicle {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public String brandName() {
        return "Car Brand Y"; 
    }

    public String color() {
        return color;
    }
}