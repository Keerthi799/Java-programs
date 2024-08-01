package Keerthi;

public class RevrseArray {

	public static void main(String[] args) {
		
	
		int arr[] = {1,3,5,7,9,11};
		int i, temp;
		System.out.println("Original Array ");
		for(i=0;i<arr.length;i++) {
			
			System.out.println(arr[i] + " ");
			
		}
		System.out.println("Rotation Array");
		temp = arr[arr.length - 1];
		for(i=arr.length-1;i>0;i--) {
			
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		for(i =0; i<arr.length;i++) {
			System.out.println(arr[i] + " ");
			
		}
		
		
		
	}

}
