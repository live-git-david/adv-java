package com.CourseView;

import java.util.Scanner;

import com.CourseRepo.ShowCourses;
import com.CourseRepo.WriteToDb;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WriteToDb.writeCourse();

//		GenerateMap.MapCourses();
//		Set<Map.Entry<Integer, Course>> st = GenerateMap.courseSet.entrySet();

//		for (Map.Entry<Integer, Course> eachEntry : st) {
//			System.out.print(eachEntry.getKey() + ":");
//			System.out.println(eachEntry.getValue().toString());
//		}
		int choice;

		do {
			choice = getChoice();
			switch (choice) {
			case 1:
				ShowCourses.displayCourses();
				break;

			case 2:
				WriteToDb.writeCourse();
				break;
			default:
				break;
			}
		} while (choice > 0);
	}

	private static int getChoice() {
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("     MENU   ");
		System.out.println("0.Quit");
		System.out.println("1.Display Courses");
		System.out.println("2.Add Courses");
		System.out.println("3.Delete Courses");
		System.out.println("4.Update Course");
		System.out.println("Your choice:");

		choice = sc.nextInt();
		return choice;

	}

}
