package org;

public class AllEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("All Even Number Print from 1 to 100");
		int even=2;
		while(even<=100) {
			System.out.print(even+"\t");
			even+=2;
		}
		
		int ctr=1;
		while(ctr<=100) {
			if(ctr%2==0)
				System.out.print(ctr+"\t");
		ctr++;
		}
	}

}
