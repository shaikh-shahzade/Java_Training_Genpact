package com.org.gen.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\shahz\\OneDrive\\Desktop\\Genpact\\Genpact_JAVA_Training\\Java_Workspace\\CoreJava_Demos\\src\\com\\org\\gen\\day7\\";
		FileInputStream file = new FileInputStream((path + "demo.txt"));
//		int  s = file.read();
//		while(s  >-1)
//		{
//			System.out.print( (char)s);
//			s=file.read();
//		}

		byte c[] = new byte[100];
		file.read(c);
		String s = new String(c);
		System.out.print(s);
	}

}
