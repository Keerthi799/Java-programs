package Keerthi;

public class Rectangle extends Mshape{
	
	int length ;
	int breadth;
	int side;
	
	public Rectangle(String name, int length, int breadth , int side) {
		
		super(length , breadth ,side);
		this.length = length;
		this.breadth = breadth;
	}
	
	void Area()
	{
		int area = length*breadth;
		System.out.println("Area of the Rectangle :"+area);
		
	}

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle("area" ,20 ,30 ,25);
		
		rectangle.Area();
		rectangle.area();
		
		
	}
	
}


