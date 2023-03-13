package exceptions;

import java.io.*;
public class CheckedExcption {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		// TODO Auto-generated method stub
		File file;
		FileInputStream stream;
		file=new File("c:/files/demo.txt");
		stream=new FileInputStream(file);
		int c;
		while((c=stream.read())!=-1) {
			System.out.print((char)c);
		}
				
	}

}
