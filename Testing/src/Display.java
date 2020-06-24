

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<html>");
		printWriter.println("<head>");
		printWriter.println("<title>Display List</title>");
		printWriter.println("</head>");
		printWriter.println("<body>");
		printWriter.println("<h1>user details..</h1>");
		// create the connection
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/HW_courses?serverTimezone=UTC", "root", "sylmar123");
			System.out.println("Connection Established!");

			// create the statement
			Statement statement = connection.createStatement();
			System.out.println("Statement created!");
			// Fetch the results by executing the query
			ResultSet resultSet = statement.executeQuery("select * from user");
			// Iterate the resultSet
			while (resultSet.next()) {
				String firstNameString = resultSet.getString("first_name");
				System.out.println(firstNameString);
				printWriter.println("<b>" + firstNameString + "</b>");
			}

//					resultSet.close();
//					statement.close();
//					connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		printWriter.println("</body>");
		printWriter.println("</html>");
	}

	public static void main(String[] args) {
		System.out.println("Driver Loaded!");
// load the driver	
//		try {
//			// Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		}

// create the connection
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mysql");
			System.out.println("Connection Established!");

// create the statement
			Statement statement = connection.createStatement();
			System.out.println("Statement created!");
			// Fetch the results by executing the query
			ResultSet resultSet = statement.executeQuery("select * from user");
			// Iterate the resultSet
			while (resultSet.next()) {
				String firstNameString = resultSet.getString("first_name");
				System.out.println(firstNameString);
			}

//			resultSet.close();
//			statement.close();
//			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
