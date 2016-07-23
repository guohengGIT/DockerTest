package src.docker;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DockerTest {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\DevOps\\Docker\\test\\test.txt");
		if(!f.exists()){
			f.createNewFile();
			System.out.println("success");
		}
		FileWriter fw = new FileWriter(f);
//		FileOutputStream fos = new FileOutputStream(fw);
		
//		byte [] str = {1,2,3};
		fw.append("test");
		fw.flush();
		fw.close();
		System.out.println("hello world");
	}
}
