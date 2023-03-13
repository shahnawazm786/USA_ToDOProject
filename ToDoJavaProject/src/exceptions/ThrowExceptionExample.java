package exceptions;

import java.io.FileNotFoundException;
import java.util.*;

public class ThrowExceptionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int age;
		System.out.println("Enter the age of voters");
		age=scan.nextInt();
		if(age>18 & age<24) {
			System.out.println("You have right to vote");
		}
		else if (age>=25) {
			throw new FileNotFoundException("File not found exception message modified");
		}
		else
		{
			throw new Exception("You are minor");
			
		}
	}

}
