package by.epam.course.array2d;

import java.util.Random;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. */

public class ArrayTask6 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

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

		for (int i = 1; i < arr.length; i = i + 1) { // i = строка
			
			for (int j = 0; j < arr[i].length; j++) { // j = столбец
				
				
				if (arr[i][0]> arr[i][arr[i].length - 1]) { // первый элемент больше последнего
					
					System.out.print(arr[i][j] + " ");
				}
			}
		
		}
	}
}
