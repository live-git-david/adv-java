package com.CourseRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowCourses {
	public static void displayCourses() {

		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/HW_courses?serverTimezone=UTC",
					"root", "sylmar123");

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Course_list");

			while (resultSet.next()) {

				String firstNameString = resultSet.getString("title");
				int course_id = resultSet.getInt("Course_id");
				System.out.println("{Course ID : Course TItle} = {" + course_id + " : " + firstNameString + "}");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Connection successful");
		// create statement

	}

}
