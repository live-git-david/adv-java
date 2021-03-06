package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataPersonInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("dataOutput.txt");
		DataInputStream din = new DataInputStream(fs);

		Person2 person2 = new Person2();
		// fetching all the primitive data type
		int ID = din.readInt();
		int age = din.readInt();
		float salary = din.readFloat();

		person2.setPersonID(ID);
		person2.setAge(age);
		person2.setSalary(salary);

		din.close();
		fs.close();
		System.out.println(person2);
		System.out.println("Success!");

	}

}
