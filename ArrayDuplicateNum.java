package Keerthi;

//Implementing a java program to Find the Duplicate value 	in Array Elements

//class declaration
public class ArrayDuplicateNum {
   //main - function
	public static void main(String[] args) {
		//Declaring array elements
		int[] arr = { 20, 30, 50, 70, 65, 50 };

		int count = 0;
          //check the duplicate value
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("The Duplicate Number is : "+arr[i]);
					count++;
				}
			}

		}
		System.out.println("The Number of Duplicate Numbers are : "+count);
	}

}

