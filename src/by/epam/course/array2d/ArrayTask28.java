package by.epam.course.array2d;

import java.util.Random;

/*// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму. */

public class ArrayTask28 {

	public static void main(String[] args) {
		int m = 3;
		int n = 3;

		int[][] arr = new int[m][n];

	}
	public static int[][] createArrayRand(int[][] arr) {
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10);
			}
		}
		return arr;

}
	public static void calcArray(int [] [] arr, int n) {
		int maxSumElement = 0;
		int sumColumn = 0;
        int index = 0;
        int rowNumber;
		
		for(int j = 0; j < n; j++) {
			
			for(int i = 0; i < arr.length; i++) {
				sumColumn= sumColumn + arr[i][j];
			}
			
			if (sumColumn > maxSumElement) {
				maxSumElement = sumColumn;
			index = j;
		}
			sumColumn = 0;
		}
		
		 rowNumber = index + 1;
		
		System.out.println("Столбец с максимальной суммой элементов = " + rowNumber);
	}
	
	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}