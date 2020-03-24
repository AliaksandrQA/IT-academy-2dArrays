package by.epam.course.array2d;

import java.util.Random;

/*Дана матрица. Вывести на экран первую и последнюю строки. */

public class ArrayTask4 {

	public static void main(String[] args) {

		int[][] arr = new int[3][5];

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

		for (int j = 0; j < arr[0].length; j++) { // длина первого элемента массива

			System.out.print(arr[0][j] + " "); // выводи первый элемент строки 
		}

		System.out.println("");
		
		for (int k = 0; k < arr[arr.length - 1].length; k++) { // k меньше чем длина последней строки   

			System.out.print(arr[arr.length - 1][k] + " "); //выводи первый элемент строки 
		}
	}
}
