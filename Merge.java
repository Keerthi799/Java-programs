package Keerthi;

public class Merge {
	
	public static void main(String[] args) {
		
		//Array values
    int arr1[]= {2,4,6,8,10};
    int	arr2[] = {3,5,7,9}; 
     int a = arr1.length;
     int b = arr2.length;
     int c = a+b;
     
     int arr3[] = new int[c];
     
     //To print arr1 values in arr3
     for(int i=0;i<arr1.length;i++) {
    	arr3[i] = arr1[i];
     }
     
     //	To print arr2 values in arr3
     for(int i =0;i<arr2.length;i++) {
    	 arr3[a+i] = arr2[i];
    	 
     }
     //To print the new array arr3 after merging
     for(int i=0;i<c;i++) {
    	 System.out.println(arr3[i]);
     }
     
	}
}
