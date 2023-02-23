package org;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// use loop (while, do-while and for)
		// step 1 control initiate
		// step 2 control check - mandatory
		// step 3 control increase/decrease
		//step1 and step3 miss  
		// print good morning - 10 times
		int ctr=1;//  step1
		
		while(ctr<=10) // step 2
		{
			System.out.println(ctr+"\tGood morning"); // actual result
			
			ctr++; // step3
		}
	}

}
