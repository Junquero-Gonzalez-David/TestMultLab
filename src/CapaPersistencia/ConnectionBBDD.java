package CapaPersistencia;

import java.sql.*;
import oracle.jdbc.OracleDriver;
public class ConnectionBBDD {

	public Connection connection;
	
		public ConnectionBBDD() {
			try{
			DriverManager.registerDriver(new OracleDriver());
			DriverManager.getConnection("jdbc:oracle:thin:@kali.eupmt.tecnocampus.cat","djunquero","v39946900");
			}
			catch(Exception e){
				System.out.println("Error al conectar a la base de dades");
			}
	}
		
		public Statement createStatement() throws SQLException{
			return connection.createStatement();
		}
		
		public PreparedStatement preapareStatement(String sql) throws SQLException {
			return connection.prepareStatement(sql);
		}

}
