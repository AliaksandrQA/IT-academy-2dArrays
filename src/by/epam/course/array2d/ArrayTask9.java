package by.epam.course.array2d;

import java.util.Random;

/* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. */

public class ArrayTask9 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		fullfillArray(arr);
		printArray(arr);
		printD(arr);

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

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}

			System.out.println();
		}
	}

	public static void printD(int[][] arr) {
		System.out.println("Элементы  по диагонали");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][i] + " ");

			System.out.println();
		}
	}
}
