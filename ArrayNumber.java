package Keerthi;

public class ArrayNumber {

	public static void main(String[] args) {
		
		boolean b = true;

		int arr[] = { 10, 43, 23, 65, 42, 76, 65 };

		int num = 65;
		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i]) {
				System.out.println("Number Found : " +arr[i]);
				break;

			}
			if(!b)
			{

			System.out.println("Number Not Found");
			}

		}

	}

}
