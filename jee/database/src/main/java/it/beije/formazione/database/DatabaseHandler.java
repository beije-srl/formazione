package it.beije.formazione.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/beijebook?user=root&password=admin");
		update(connection);
		select(connection);
		
		connection.close();
	}

	private static void select(Connection conn) throws SQLException {		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from UTENTI");
		while(rs.next()){
		String email = rs.getString(1);
		String password = rs.getString(2);
		
		System.out.println("email:" + email);
		System.out.println("password:" + password);
		}

	}
	
	private static void update(Connection conn) throws SQLException{
		Statement stmt = conn.createStatement();
		boolean result = stmt.execute("insert into UTENTI values('FABIO.BIANCHI@BEIJE.IT', 'BANANA')");
	}
}