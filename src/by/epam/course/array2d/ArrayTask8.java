package by.epam.course.array2d;

/*Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
массива. */

public class ArrayTask8 {

	public static void main(String[] args) {

		int [] [] arr = {{1,3,-7,1,9},{-1,-2,-3,-5,-7},{-1,-1,-1,-3,-5},{2,-3,7,-3,7},{-1,1,3,7,-9}};
		
		calcArr(arr);
	}

	public static void calcArr(int [] [] arr) {
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for ( int j = 0; j <arr[i].length; j++) {
				if (arr[i][j] == 7) {
					count++;
					
				}
			}
		}  System.out.println(count);
	}
}