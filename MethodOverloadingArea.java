package Keerthi;

public class MethodOverloadingArea {

    // Method to calculate the area of a square
	
    public double Area(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
    	
    	MethodOverloadingArea calculator = new MethodOverloadingArea();

        // Calculate and print the areas of different shapes
    	
        System.out.println("Area of square : " + calculator.Area(5));
        System.out.println("Area of rectangle : " + calculator.area(6, 3));
        System.out.println("Area of circle : " + calculator.area(3.5));
    }
}
