package Keerthi;


//Circle class extending Shape
class circle extends shape {
//Constructor for Circle that calls the parent Shape constructor
public circle(String name, double radius) {
	
	System.out.println("Circle Details:"+"\nname:"+name+"\nradius:"+2);

}

public static void main(String[] args) {
circle c1 = new circle("Circle", 4);


c1.name="Circle";
c1.radius = 5;
c1.diameter = 2 * radius;
c1.area = Math.PI * radius * radius;


c1.shapeInfo();

}


}



