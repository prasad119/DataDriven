package com.txt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class Readtxt {
	@Test
	public void f() {
		try{
			FileInputStream f= new FileInputStream("C:/Users/Chaitanya/workspace/HDFC/collections/Files/src/com/txt/sample.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(f));

			String strLine;
			while ((strLine = br.readLine()) != null)   {
				System.out.println (strLine);
			}


			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}