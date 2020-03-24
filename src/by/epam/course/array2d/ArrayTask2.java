package by.epam.course.array2d;

import java.util.Random;

/*Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. */

public class ArrayTask2 {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];

		fullfillArray(arr);
		printArray(arr);

	}

	public static int[][] fullfillArray(int[][] arr) {

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(10);
			}
		}
		return arr;

	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for ( int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
