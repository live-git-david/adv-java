package labexercises;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class CourseToFile {

	public static void main(String[] args) {

		Map<Integer, Course> courseSet = new HashMap<Integer, Course>();
		Course c1 = new Course("Winter 2019", 0, "Physics9D", "Blackwell", "Physics");
		Course c2 = new Course("Fall 2013", 1, "ECS30", "Butner", "Computer Science");
		Course c3 = new Course("Spring 2019", 2, "Parrallel Programming", "Porquet", "Computer Science");
		Course c4 = new Course("Fall 2018", 3, "Chicano 10", "Lopez", "Chicano");
		Course c5 = new Course("Winter 2016", 4, "Intro to Brewing", "LedMan", "Food Science");
		Course c6 = new Course("Fall 2012", 5, "Advance Tennis", "Daryl", "Physical Education");
		Course c7 = new Course("Spring 2014", 6, "Chem 2B", "Toupadakis", "Chemisty");
		Course c8 = new Course("Fall 2015", 7, "Biology 2A", "Lindsay", "Biology");
		Course c9 = new Course("Spring 2015", 8, "Data Structure and Algorithms", "Davis", "Computer Science");
		Course c10 = new Course("Fall 2017", 9, "Chicano 50", "Adams", "Chicano");

		courseSet.put(0, c1);
		courseSet.put(1, c2);
		courseSet.put(2, c3);
		courseSet.put(3, c4);
		courseSet.put(4, c5);
		courseSet.put(5, c6);
		courseSet.put(6, c7);
		courseSet.put(7, c8);
		courseSet.put(8, c9);
		courseSet.put(9, c10);

		// write to file

		try {
			writeToFile(courseSet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Success!");
	}

	public static void writeToFile(Map<Integer, Course> setMap) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("Courses.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(setMap);
		objectOutputStream.close();
		fileOutputStream.close();
	}

}
