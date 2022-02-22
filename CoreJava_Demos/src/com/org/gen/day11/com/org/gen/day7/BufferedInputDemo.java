package com.org.gen.day7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("demo.txt");

		BufferedInputStream br = new BufferedInputStream(f);

		br.skip(200);

		br.mark(10);

		byte[] b = new byte[5000];
		br.read(b);

		System.out.println(new String(b));

		br.reset();
		byte[] b2 = new byte[5000];
		// br.read(b2);

		System.out.println("Mark" + (char) br.read());
	}

}
