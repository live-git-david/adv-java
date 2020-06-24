package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCselectDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// create the connection

		// Connection connection =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306", "root",
		// "sylmar123");
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila?serverTimezone=UTC",
				"root", "sylmar123");

		System.out.println("Connection successful");
		// create statement
		Statement statement = connection.createStatement();

		// fetch the result by executing the query
		ResultSet resultSet = statement.executeQuery("select * from actor");
		while (resultSet.next()) {

			String firstNameString = resultSet.getString("first_name");
			System.out.println(firstNameString);

		}
	}

}
