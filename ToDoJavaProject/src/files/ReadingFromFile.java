package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ReadingFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("c:/files/demo.txt");
		FileReader reader=new FileReader(file);
		int c;
		while((c=reader.read())!=-1) {
			System.out.print((char)c);
		}
		FileWriter writer=new FileWriter(file);
		writer.write("hello java");
		writer.append("hello c#");
		writer.append("hello c language");
		writer.append("hello python language");
		writer.flush();
		WebDriver driver=new ChromeDriver();
	}
}
