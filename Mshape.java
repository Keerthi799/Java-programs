package Keerthi;

public class Mshape {
	
	int length;
	int breadth;
	int side;
	
	
    public Mshape(int side, int breadth , int length) {
		
		super();
		this.side = side;
		this.length = length;
		this.breadth = breadth;
    }
    
    
		
	void area() {

		int area = side * side;
		System.out.println("Area of Shape :"+area);
		
	}
	
   public static void main(String[] args) {
		
		Mshape shape = new Mshape(25, 20, 30);
	
		shape.area();
		

	}

	
}