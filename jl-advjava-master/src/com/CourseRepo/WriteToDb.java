package com.CourseRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author davidmorales
 *
 */

public class WriteToDb {

	public static void writeCourse() {
		int id = 0;
		String title = null;
		String term = null;
		String instructor = null;
		String subjectString = null;
		try {
			System.out.println(
					"Please enter the course information in the format (Course_id/title/term/instructor/subject_area)");

			Scanner sc = new Scanner(System.in);

			String course = sc.nextLine();
			String[] parts = course.split("/");

			id = Integer.parseInt(parts[0]);

			title = "\"" + parts[1] + "\"";
			term = "\"" + parts[2] + "\"";
			instructor = "\"" + parts[3] + "\"";
			subjectString = "\"" + parts[4] + "\"";
//			System.out.println("INSERT INTO Course_list(Course_id, title, term, instructor, subject_area ) values ("
//					+ Integer.toString(id) + ", " + title + ", " + term + ", " + instructor + ", " + subjectString
//					+ ")");
//			System.out.println("--------------------------------------------------------");
//			System.out.println(
//					"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (10, \"Fall 2017\", \"Chicano 50\", \"Adams\", \"Chicano\")");

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/HW_courses?serverTimezone=UTC", "root", "sylmar123");

			System.out.println("Connection successful");
			// create statement
			Statement statement = connection.createStatement();

			int numOfRowsInserted = statement
					.executeUpdate("INSERT INTO Course_list(Course_id, title, term, instructor, subject_area ) values ("
							+ Integer.toString(id) + ", " + title + ", " + term + ", " + instructor + ", "
							+ subjectString + ")");

			System.out.println("No of Rows Inserted : " + numOfRowsInserted);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
