package by.epam.course.array2d;

import java.util.Random;

/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class ArrayTask10 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];
		fullfillArray(arr);
		calcArr(arr);

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

	public static void calcArr(int[][] arr) {
		int k; 	int p;

		p = 3;
		k = 2;

		for (int i = 0; i < arr[k].length; i++) {

			System.out.print(arr[k - 1][i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][p - 1] + " ");
	}
}
}