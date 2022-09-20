package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Clicad {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from Clicad ");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Clicod") + ", " + rs.getString("Clinome")+ ", " + rs.getString("Cliend")+ ", " + rs.getString("Clicep")+ ", " + rs.getString("Clidata")+ ", " + rs.getString("Cligenero"));
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

