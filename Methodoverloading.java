package Keerthi;

public class Methodoverloading {
	
  double avg(int a,int b) {
		
		double avg =(a+b)/2;
		return avg;
	}
	
    double avg(int a,int b,int c) {
		
		double avg =(a+b+c)/3;
		return avg;
	}
    
     double avg(int a,int b,int c,int d) {
		
		double avg =(a+b+c+d)/4;
		return avg;
	}
     
    public static void main(String[] args) {
    	
    	Methodoverloading load = new Methodoverloading();
    	System.out.println("Average of 2 i/p="+load.avg(20, 30));
    	System.out.println("Average of 3 i/p="+load.avg(12, 16, 18));
    	System.out.println("Average of 4 i/p="+load.avg(32, 64, 86, 43));
    	
	}

}
