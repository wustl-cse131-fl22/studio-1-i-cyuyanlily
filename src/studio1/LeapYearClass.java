package studio1;

import java.util.Scanner;

public class LeapYearClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a year: ");
		int year = in.nextInt();
		int remainder1 = year % 4;
		int remainder2 = year % 100;
		boolean A = ((year % 4) == 0 && (year % 100) != 0) || ((year % 400) == 0);
		System.out.println(year + " is a leap year: " + A);

	}

}
