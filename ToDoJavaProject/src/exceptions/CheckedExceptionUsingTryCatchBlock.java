package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionUsingTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file;
		FileInputStream stream=null;
		file=new File("c:/files/demo.txt");
		try {
				stream=new FileInputStream(file);
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
			System.out.println("File not found!!!!");
		}
		finally
		{
			System.out.println("I have executed at the last");
		}
		int c;
		try {
		while((c=stream.read())!=-1) {
			System.out.print((char)c);
		}
		}catch(IOException ie) {
			ie.printStackTrace();
			System.out.println("File not found!!!!");
		}
		
	}

}
