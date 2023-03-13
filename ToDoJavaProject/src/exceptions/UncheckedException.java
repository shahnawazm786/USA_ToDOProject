package exceptions;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double commission=0;
		double total_sales=0;
		int no_of_customer=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total sales");
		total_sales=scan.nextInt();
		System.out.println("Enter total no customer made for current month");
		no_of_customer=scan.nextInt();
		try {
		commission=total_sales/no_of_customer;
		}catch(ArithmeticException ae) {
			System.out.println();
			ae.printStackTrace();
		}
		System.out.println("Commission"+commission);
	}

}
