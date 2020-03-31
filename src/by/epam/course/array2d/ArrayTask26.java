package by.epam.course.array2d;

import java.util.Scanner;

/* 26. С клавиатуры вводится двумерный массив чисел размерностью nxm.
 *  Выполнить с массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.*/

public class ArrayTask26 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите n строк в массиве: ");

		int n = sc.nextInt();

		System.out.println("Введите m столбцов в массиве: ");

		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		System.out.println("Введите числа, для заполнения  массива: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = sc.nextInt();

				//calcNegativeSum();
				 //printSumNeg(arr);
				 //printMaxElem(arr);

			}
		}
	}
	// вычислить сумму отрицательных элементов в каждой строке;

	public static int calcNegativeSum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {

				sum = sum + arr[i];

			}
		}
		return sum;
	}
		

	public static void printSumNeg(int n, int [] arr) {
		
		calcNegativeSum(arr);
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
		int rowNumber = i + 1;
		System.out.println("Sum of negative elements in " + rowNumber + " row = " + sum);
	}
		
			
	}

	// определить максимальный элемент в каждой строке;

	public static int findMax(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
