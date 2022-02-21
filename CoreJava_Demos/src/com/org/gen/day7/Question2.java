package com.org.gen.day7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Creating New File
		File file = new File("data.txt");
		file.createNewFile();

		// Getting Data From User
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		sc.close();
		// Writing From File
		FileOutputStream fo = new FileOutputStream(file);

		fo.write(data.getBytes());

		// Reading From File
		FileInputStream finS = new FileInputStream(file);
		BufferedInputStream binS = new BufferedInputStream(finS);
		int temp = binS.read();
		while (temp > -1) {
			System.out.print((char) temp);
			temp = binS.read();
		}
	}

}
