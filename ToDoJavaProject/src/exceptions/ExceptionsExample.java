package exceptions;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=100;b=200;
		System.out.println(a+b);
		int c; 
		// check website students  / teacher /
		String type="employee";
		if(type.equals("student")) {
			System.out.println("eligible");
		}
		else if(type.equals("employee")) {
			System.out.println("not eligible");
		}
		c=a+b;
		System.out.println(c);
		
		//System.out.println(100/0);
		File file=new File("C:/download/abc.txt");
		if(file.exists())
		{
			System.out.println("Yes exist");
		}
		else
		{
			System.out.println("Not Exist");
		}
		//FileInputStream steam=new FileInputStream(file);
		
	}
}
