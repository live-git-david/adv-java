package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPersonObject_ObjectInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Step 2 Establish streams
		// access the file on the file system
		File file = new File("person.dat");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			Person person = null;

			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			System.out.println("Written Object" + person);
			person = (Person) objectInputStream.readObject();

			objectInputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}