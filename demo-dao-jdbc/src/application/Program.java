package application;

import model.dao.CadcliDao;
import model.dao.DaoFactory;
import model.entities.Cadcli;
import model.entities.Clicad;

public class Program {

	public static void main(String[] args) {
		Cadcli obj = new Cadcli(1,"Francisco");
		
		Clicad clicad = new Clicad(1, "Francisco", "Rua da Paz, 175, Bairro da Creche, Tucano,Bahia", "48790-000", "2021-06-18", "Masculino" );
		
		CadcliDao cadcliDao = DaoFactory.createCadcliDao();
		
		System.out.println(clicad);

	}
}
