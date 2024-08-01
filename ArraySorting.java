package Keerthi;

//Implementing a java program to Sort the Array Elements

//class declaration
public class ArraySorting {
    
  //main - function
	public static void main(String[] args) {
		
       //Declaring array elements
		
		int arr[] = { 16, 23, 14, 43, 37, 12, 5 };
		int i = 0;
		int j = 0;
		
     //To sort the elements in ascending order
		
		for (i = 0; i < arr.length - 1; i++) {

			for (j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

	}

}
