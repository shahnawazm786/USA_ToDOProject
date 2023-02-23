package org;

import java.util.Scanner;

public class IfElseIfConstructExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int total=0;
		System.out.println("Enter total marks of students ->");
		total=scan.nextInt();
		
		if(total>91 & total<=100) {
			System.out.println("Excellent");
		}
		else if(total>81 & total<=90) {
			System.out.println("Outstanding");
		}
		else if(total>71 & total<=80) {
			System.out.println("Very Good");
		}
		else if(total>61 & total<=70) {
			System.out.println("Good");
		}
		else if(total>51 & total<=60) {
			System.out.println("Average");
		}
		else
		{
			System.out.println("Bad");
		}
	}

}
