package by.epam.course.array2d;

import java.util.Random;

/* Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.*/

public class ArrayTask5 {

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

		for (int i = 0; i < arr.length; i = i + 2) { // i  это строка 
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); //  четные строки !!
			}
		}
	}
}
