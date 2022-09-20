package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Cadcli {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from Cadcli ");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Codcli") + ", " + rs.getString("Nomecli")+ ", " + rs.getString("Endcli")+ ", " + rs.getString("Cepcli")+ ", " + rs.getString("Datacli")+ ", " + rs.getString("Generocli")+ ", " + rs.getString("Exportado"));
			}
		
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
			
			
		}

	}

}
