package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Funcionarios {
	
public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from Funcionarios ");
			
			while (rs.next()) {
				System.out.println(rs.getInt("IdFuncionario") + ", " + rs.getString("Nome")+ ", " + rs.getString("Email")+ ", " + rs.getString("Sexo")+ ", " + rs.getString("Departamento")+ ", " + rs.getInt("Salario")+ ", " + rs.getString("Cargo")+ ", " + rs.getInt("IdRegiao")+ ", " + rs.getString("Exportado"));
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
