package by.epam.course.array2d;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int month;
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter month's number: ");
		while (!sc1.hasNextInt()) {

			System.out.println("Only digits should be entered : ");

			sc1.next();
			month = sc1.nextInt();

			if ( month == 1) {
				System.out.println(" Entered number refers to January");
			}
			
			if ( month == 2) {
				System.out.println(" Entered number refers to February");
			}
			if ( month == 3) {
				System.out.println(" Entered number refers to March");
			}			

			if ( month == 4) {
				System.out.println(" Entered number refers to April");
			}
			if ( month == 5) {
				System.out.println(" Entered number refers to May");
			}

			if ( month == 6) {
				System.out.println(" Entered number refers to June");
			}
			if ( month == 7) {
				System.out.println(" Entered number refers to July");
			}
			if ( month == 8) {
				System.out.println(" Entered number refers to August");
			}
			
			if ( month == 9) {
				System.out.println(" Entered number refers to September");
			}
			if ( month == 10) {
				System.out.println(" Entered number refers to October");
			}
			if ( month == 11) {
				System.out.println(" Entered number refers to November");
			}
			if ( month == 12) {
				System.out.println(" Entered number refers to December");
			} else {
				System.out.println(" (\"Unexpected value: \" + month);");
			}
				
	}
}
}

