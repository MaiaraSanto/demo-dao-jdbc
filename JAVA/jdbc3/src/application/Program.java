package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
			Connection conn = null;
			PreparedStatement st =  null;
			try {
				conn = DB.getConnection();
				
				st = conn.prepareStatement(
						"INSERT INTO Clicad "
						+ "(Clicod, Clinome,Cliend, Clicep, Clidata, Cligenero )"
						+ "VALUES"
						+ "(?, ?, ?, ?, ?, ?)" , Statement.RETURN_GENERATED_KEYS );
				
				st.setInt(1,26);
				st.setString(2, "Jão");
				st.setString(3, "Rua Conslheiro, 175, Bairro da Creche, Tucano,Bahia");
				st.setString(4, "48790-000");
				st.setString(5, "2021-06-18");
				st.setString(6, "Masculino");
				
						
				int rowsAffected = st.executeUpdate();	
				
				if (rowsAffected > 0) {
					ResultSet rs = st.getGeneratedKeys();
					while (rs.next()) {
						int Clicod = rs.getInt(25);
						System.out.println(" Clicod = " + Clicod);
					}
				}
				
				else {
					System.out.println("No rown affected!");
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
			
		}
	}
}


