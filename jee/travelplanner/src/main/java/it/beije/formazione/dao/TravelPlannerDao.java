package it.beije.formazione.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

public class TravelPlannerDao {
	private Connection connection;


	public TravelPlannerDao() throws SQLException {
		Driver driver=new Driver();
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/travel?user=root&password=admin&serverTimezone=UTC");
	}


	private static ArrayList<String> select(Statement statement) throws SQLException {
		ResultSet result = statement.executeQuery("SELECT * FROM itinerario"); // esegui questa query
		ArrayList<String> lista= new ArrayList<String>();
		 while(result.next()){ 
			lista.add(result.getString("utente"));
		 }
		 return lista;
	}
	
	public String ritorna(String nome) throws SQLException{
		if((select(connection.createStatement()).contains(nome)))
				return "true";
		else
				return "false";
	}
}