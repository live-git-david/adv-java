package com.CourseRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddEntriesToDb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/HW_courses?serverTimezone=UTC",
				"root", "sylmar123");

		System.out.println("Connection successful");
		// create statement
		Statement statement = connection.createStatement();

		int numOfRowsInserted = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (1, 'Winter 2019', 'Physics9D', 'Blackwell', 'Physics')");

		int numOfRowsInserted1 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (2, \"Fall 2013\", \"ECS30\", \"Butner\", \"Computer Science\")");

		int numOfRowsInserted2 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (3, \"Spring 2019\", \"Parrallel Programming\", \"Porquet\", \"Computer Science\")");

		int numOfRowsInserted3 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (4, \"Fall 2018\", \"Chicano 10\", \"Lopez\", \"Chicano\")");
		int numOfRowsInserted4 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (5, \"Winter 2016\", \"Intro to Brewing\", \"LedMan\", \"Food Science\")");

		int numOfRowsInserted5 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (6, \"Fall 2012\", \"Advance Tennis\", \"Daryl\", \"Physical Education\")");
		int numOfRowsInserted6 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (7, \"Spring 2014\", \"Chem 2B\", \"Toupadakis\", \"Chemisty\")");

		int numOfRowsInserted7 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (8, \"Fall 2015\", \"Biology 2A\", \"Lindsay\", \"Biology\")");
		int numOfRowsInserted8 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (9, \"Spring 2015\", \"Data Structure and Algorithms\", \"Davis\", \"Computer Science\")");

		int numOfRowsInserted9 = statement.executeUpdate(
				"INSERT INTO Course_list(Course_id, title, term, instructor, subject_area) values (10, \"Fall 2017\", \"Chicano 50\", \"Adams\", \"Chicano\")");

	}

}
