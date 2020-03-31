package by.epam.course.array2d;

import java.util.Random;

/*Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
строка слева направо, третья строка справа налево и так далее. */

public class ArrayTask11 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];

		fullfillArray(mas);

		Array(mas);

	}

	public static int[][] fullfillArray(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
			
		}
		return mas;
	} 
	
	

	public static void Array(int[][] arr) {

		System.out.println();
		
		for (int i = 0; i < arr.length; i++) { // внешний цикл // пробегаемся по строкам 

			if (i % 2 == 0) { // если строка делится без остатка выводи справа налево// первая строка с индексом [0]
				
				for (int j = arr[i].length - 1; j > -1; j--) { // внутренний цикл // бежим по элементам массива // j равно значению последнего элемента в строке// j > 1 

					System.out.print(arr[i][j] + " ");
				}
				System.out.println("");
			}

			else {
				for (int k = 0; k < arr[i].length; k++) {

					System.out.print(arr[i][k] + " ");
				}
				System.out.println("");
			}

		}
	}
}