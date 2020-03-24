package by.epam.course.array2d;

/* Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.*/

public class ArrayTask7 {

	public static void main(String[] args) {
		
		
		int [] [] arr = {{1,3,-7,1,9},{-1,-2,-3,-5,-7},{-1,-1,-1,-3,-5},{2,-3,7,-3,7},{-1,1,3,-7,-9}};
		
		calcArr(arr);
	}

	public static void calcArr(int [] [] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for ( int j = 0; j <arr[i].length; j++) {
				if (arr[i][j] < 0 && arr[i][j] % 2 !=0) {
					sum = sum + Math.abs(arr[i][j]);
					
				}
			}
		}  System.out.println(sum);
	}
}
