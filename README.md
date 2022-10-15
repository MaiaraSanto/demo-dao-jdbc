# demo-dao-jdbc
 ***
 Projeto sobre Integração do Banco de Dados do MYSql à Linguagem de Programação JAVA, via API JDBC. 

Neste primeiro momento. houve a inserção de todos os registros da Tabela Cadcli e Clicad, para dentro do Console da IDE Spring Tools ( Boot). 

Este protótipo faz parte do Projeto Data Science, no curso da StackX - Formação de Desenvolvedores de Software e será como forma de manipular e

aprimorar futuramente uma RP com base em dados voltado a área da saúde.

***

# Script feito no MySQL e integrado ao JAVA através da API JDBC

```bash

INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (1,'Francisco ','Rua da Paz, 175, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (2,'Andressa','Rua Antônio Carlos, 185, Bairro da Cascalheira, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (3,'Fabricio','Rua da Paz, 175, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (4,'Alexandre','Avenida Presidente Kennedy, 785, centro, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (5,'Adriano','Rua da Paz, 175, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (6,'Mauricio','Praça Vigário Martins, 175, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (7,'Marcela','Rua da Paz, 800, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (8,'Cristina','Rua da Paz, 400, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (9,'Sarah','Rua da Paz, 175, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (10,'Humberto','Rua da Cachoeira, 145, Bairro da Cascalheira, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (11,'Fernanda','Rua Antônio brito, 100, Bairro da Bombinha, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (12,'Emanuel','Rua da Paz, 176, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (13,'Jeferson','Avenida ACM, 200, Centro, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (14,'José','Avenida ACM, 145, Centro, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (15,'José','Rua Carlos Sousa Silva, 574, Bairro da Laranjeira Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (16,'José','Rua Carlos Sousa Silva, 6784, Bairro da Laranjeira, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (17,'José','Rua Carlos Sousa Silva, 456, Bairro da Laranjeira, Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (18,'José','Rua da Flores, 777, Bairro da Laranjeira Tucano,Bahia','48790-000','2021-06-18','Masculino',NULL);
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (19,'Fabiana','Rua Antônio Sousa , 445, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
INSERT INTO `` (`Codcli`,`Nomecli`,`Endcli`,`Cepcli`,`Datacli`,`Generocli`,`Exportado`) VALUES (20,'Jenifer','Rua Conslheiro, 145, Bairro da Creche, Tucano,Bahia','48790-000','2021-06-18','Feminino','True');
```

***

# Código utilizado para integração da Tabela ao JAVA

```bash
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
```
