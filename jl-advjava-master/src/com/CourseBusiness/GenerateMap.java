package com.CourseBusiness;

import java.util.HashMap;
import java.util.Map;

public class GenerateMap {

//	public static void main(String[] args) {
//
//		Map<Integer, Course> courseSet = new HashMap<Integer, Course>();
//		Course c1 = new Course(1, "Winter 2019", "Physics9D", "Blackwell", "Physics");
//		Course c2 = new Course(2, "Fall 2013", "ECS30", "Butner", "Computer Science");
//		Course c3 = new Course(3, "Spring 2019", "Parrallel Programming", "Porquet", "Computer Science");
//		Course c4 = new Course(4, "Fall 2018", "Chicano 10", "Lopez", "Chicano");
//		Course c5 = new Course(5, "Winter 2016", "Intro to Brewing", "LedMan", "Food Science");
//		Course c6 = new Course(6, "Fall 2012", "Advance Tennis", "Daryl", "Physical Education");
//		Course c7 = new Course(7, "Spring 2014", "Chem 2B", "Toupadakis", "Chemisty");
//		Course c8 = new Course(8, "Fall 2015", "Biology 2A", "Lindsay", "Biology");
//		Course c9 = new Course(9, "Spring 2015", "Data Structure and Algorithms", "Davis", "Computer Science");
//		Course c10 = new Course(10, "Fall 2017", "Chicano 50", "Adams", "Chicano");
//
//		courseSet.put(1, c1);
//		courseSet.put(2, c2);
//		courseSet.put(3, c3);
//		courseSet.put(4, c4);
//		courseSet.put(5, c5);
//		courseSet.put(6, c6);
//		courseSet.put(7, c7);
//		courseSet.put(8, c8);
//		courseSet.put(9, c9);
//		courseSet.put(10, c10);
//
//		// write to file
//
////		try {
////			writeToFile(courseSet);
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//
//		System.out.println("Success!");
//	}

//	public static void writeToFile(Map<Integer, Course> setMap) throws IOException {
//		FileOutputStream fileOutputStream = new FileOutputStream("Courses.txt");
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		objectOutputStream.writeObject(setMap);
//		objectOutputStream.close();
//		fileOutputStream.close();
//	}
	public static Map<Integer, Course> courseSet = new HashMap<Integer, Course>();

	public static void MapCourses() {

		Course c1 = new Course(1, "Winter 2019", "Physics9D", "Blackwell", "Physics");
		Course c2 = new Course(2, "Fall 2013", "ECS30", "Butner", "Computer Science");
		Course c3 = new Course(3, "Spring 2019", "Parrallel Programming", "Porquet", "Computer Science");
		Course c4 = new Course(4, "Fall 2018", "Chicano 10", "Lopez", "Chicano");
		Course c5 = new Course(5, "Winter 2016", "Intro to Brewing", "LedMan", "Food Science");
		Course c6 = new Course(6, "Fall 2012", "Advance Tennis", "Daryl", "Physical Education");
		Course c7 = new Course(7, "Spring 2014", "Chem 2B", "Toupadakis", "Chemisty");
		Course c8 = new Course(8, "Fall 2015", "Biology 2A", "Lindsay", "Biology");
		Course c9 = new Course(9, "Spring 2015", "Data Structure and Algorithms", "Davis", "Computer Science");
		Course c10 = new Course(10, "Fall 2017", "Chicano 50", "Adams", "Chicano");

		courseSet.put(1, c1);
		courseSet.put(2, c2);
		courseSet.put(3, c3);
		courseSet.put(4, c4);
		courseSet.put(5, c5);
		courseSet.put(6, c6);
		courseSet.put(7, c7);
		courseSet.put(8, c8);
		courseSet.put(9, c9);
		courseSet.put(10, c10);

		// write to file

//		try {
//			writeToFile(courseSet);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Success!");
	}

}
