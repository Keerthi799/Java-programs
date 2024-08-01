package Keerthi;

public class SquareAndCube {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};

        for (int num : numbers) {
            int square = num * num; //square of the numbers
            int cube = num * num * num; //cube of the numbers
            System.out.println(square);
            System.out.println(cube);
        }
    }
}