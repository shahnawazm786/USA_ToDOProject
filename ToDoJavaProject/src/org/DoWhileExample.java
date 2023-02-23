package org;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while if condition is wrong - it wont execute
		// do -while even condition is wrong - it will execute at least one times
		
		int ctr=100;
		while(ctr<100) {
			System.out.println("Display");
			ctr++;
		}
		do
		{
			System.out.println("Display");
			ctr++;
		}while(ctr<100);
		
	}

}
