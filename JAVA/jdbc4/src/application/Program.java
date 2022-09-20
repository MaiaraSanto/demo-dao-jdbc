package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE Cadcli "
					+ " SET Exportado = ? "
					+ "WHERE "
					+ "(Generocli = ?)");
			
			st.setString(1, "True");
			st.setString(2, "Feminino");
			
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


