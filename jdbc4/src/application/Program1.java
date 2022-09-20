package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program1 {

public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE Funcionarios "
					+ " SET Exportado = ? "
					+ "WHERE "
					+ "(Sexo = ?)");
			
			st.setString(1, "False");
			st.setString(2, "Masculino");
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected " + rowsAffected );
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
