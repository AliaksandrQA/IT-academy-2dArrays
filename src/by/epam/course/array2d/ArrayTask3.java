package by.epam.course.array2d;

import java.util.Random;

/*Дана матрица. Вывести на экран первый и последний столбцы.*/

public class ArrayTask3 {

	public static void main(String[] args) {
		


		int[][] arr = new int[2][5];

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
			System.out.println(arr[i][0] + " "+ arr[i][arr[i].length-1]);
			}  
		}
	}



