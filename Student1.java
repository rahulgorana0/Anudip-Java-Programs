// 1.Write a JDBC program to insert a record into a database (Table:Student: id,name,age,phone_no,email)

// Program:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student1
{
	public static void main(String[] args) 
	{
		// Try to connect or execute statement
		try
		{
			// Register Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create Connection
			Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root", "12345678");
			// Create Statement
			Statement s1 = c1.createStatement();
			String students = "INSERT INTO student VALUES (101, 'Amit Sharma', 20, '9876543210', 'amit.s@example.com'),"
												   + "(102, 'Priya Das', 21, '8765432109', 'priya.d@example.com'),"
												   + "(103, 'Ravi Kumar', 22, '7654321098', 'ravi.k@example.com'),"
												   + "(104, 'Sneha Reddy', 19, '9123456780', 'sneha.r@example.com'),"
												   + "(105, 'John Doe', 20, '9988776655', 'john.doe@example.com');";
			// Execute Query
			int rows = s1.executeUpdate(students);
			System.out.println(rows);
			// Close Connection
			c1.close();
		}
		// Catch if not connect or execute
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

// Output:

/*
5
*/