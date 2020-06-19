package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataPersonOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("dataOutput.txt");
		DataOutputStream dout = new DataOutputStream(fs);

//		Person person = new Person("David", 25, 'M');
		Person2 person2 = new Person2(12, 25, 3.6f);
		dout.writeInt(person2.getPersonID());

		dout.writeInt(person2.getAge());
		dout.writeFloat(person2.getSalary());
		dout.flush();
		dout.close();

		System.out.println("Success!");
	}

}
