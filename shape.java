package Keerthi;

//class shape represents variables like name,radius,diameter,area
public class shape
{
//Attributes of the shape class
String name;
static double radius;
double diameter;
double area;

void shapeInfo() {
    System.out.println("shapeInfo:" + "\nname: " + name + "\nradius: " + radius + "\ndiameter: " + diameter + "\narea: " + area);
}

//Main method to create shape and display its info
public static void main(String[] args)
{
    shape s1 = new shape();
    s1.name="Circle";
    s1.radius = 5;
    s1.diameter = 2 * radius;
    s1.area = Math.PI * radius * radius;
    
    
    s1.shapeInfo();
   
}
}



