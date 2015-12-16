package com.txt;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.testng.annotations.Test;

public class Writetxt {
	@Test
	public void f() {
		try{
			String content = "This is the content to write into file";

			File file = new File("C:/Users/Chaitanya/workspace/HDFC/collections/Files/src/com/txt/sample1.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}