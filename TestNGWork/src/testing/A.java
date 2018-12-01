package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetRow;



public class A {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int i=1;
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Testing", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs=   s.executeQuery("select id,name,abc from customers");
		while(rs.next())
		{
			if(i>=4 && i<=20)
			{
			  System.out.println(rs.getString("contactLastName"));
			}
			i++;
		}
		
	}
	
}
