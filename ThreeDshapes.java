package Keerthi;



public interface ThreeDshapes {
	
	double volume();
	
	default void msg() {
		
		System.out.println("Default method");
		
	}

   static void call() {
	   
	   System.out.println("static method");

	}

}
 