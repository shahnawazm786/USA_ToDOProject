package org;

import java.util.*;
public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Weekdays pattern");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weekdays number");
		int weekdaysno=sc.nextInt();
		switch(weekdaysno) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Wrond days");
		}
	}

}
