package com.slokam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class TextFile {

	@Test(enabled=false)
	public void testread() {

		// Create file object
		File file = new File("D:\\code.txt");

		// create FileInputStream object
		try {
			FileInputStream fis = new FileInputStream(file);
			
			
			int i =0;
			while( (i = fis.read()) !=-1){
				char c = (char)i;
				System.out.print(c);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRead2(){
		// Create file object
		File file = new File("D:\\code.txt");
		
		try {
			FileReader reader  = new FileReader(file);
			BufferedReader buff = new BufferedReader(reader);
			String line = "";
			
			while((line = buff.readLine())!=null){
				System.out.println(line);
			}
			buff.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testwrite1(){
		File file = new File("D:\\newfile.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testWrite2(){
		File file = new File("D:\\newFile2.txt");
		
		try {
			FileWriter writer = new FileWriter(file);
			BufferedWriter buff = new BufferedWriter(writer);
			buff.write("I am kumar");
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
