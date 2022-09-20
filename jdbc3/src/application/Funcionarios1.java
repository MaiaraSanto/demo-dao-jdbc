package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Funcionarios1 {
	
public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from Funcionarios1 ");
			
			while (rs.next()) {
				System.out.println(rs.getInt("IdFuncionario1") + ", " + rs.getString("Nome1")+ ", " + rs.getString("Email1")+ ", " + rs.getString("Sexo1")+ ", " + rs.getString("Departamento1")+ ", " + rs.getInt("Salario1")+ ", " + rs.getString("Cargo1")+ ", " + rs.getInt("IdRegiao1"));
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
