package Keerthi;


public class ArrayMinMax {

	public static void main(String[] args) {
		
		//Giving the values to array
		
		int[] arr = {80,36,120,68,15,75,180};
		
		int Min =arr[0];
		int Max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			//for minimum value
			
			if(Min>arr[i]) {
				 Min = arr[i];
		}
			//for maximum value
			if(Max<arr[i]) {
				Max = arr[i];
				
				
			}
		}
  
		//To print the Maximum and Minimum Values
		
		System.out.println("The Minimum Number is :"+Min);
		System.out.println("The Maximum Number is :"+Max);
	}

}
