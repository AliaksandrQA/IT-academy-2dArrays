package by.epam.course.array2d;

/*1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
вывести на экран. */

public class ArrayTask1 {

	public static void main(String[] args) {

		int[][] array = new int[3][4];

		
		fullfillArray(array);
		printArray(array);

	}
	
	public static int [] [] fullfillArray(int [] [] array) {
		
		for (int i = 0; i < array.length; i++) { // i меньше длины массива

			array[i][0] = 1; // [строка] [столбец]
		}

		for (int i = 0; i < array.length; i++) { 

			for (int j = 1; j < array[i].length; j++) { // j меньше длины (строк)  

				array[i][j] = 0; // [строка] [столбец]
			}
		} return array;
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