package com.full;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SystemOut {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("This is the print line");

		File file;

		FileOutputStream fileOutputStream;

		String message = "this is a long day";
		file = new File("message.txt");
		fileOutputStream = new FileOutputStream(file);
		byte[] messageByte = message.getBytes();

	}

}
