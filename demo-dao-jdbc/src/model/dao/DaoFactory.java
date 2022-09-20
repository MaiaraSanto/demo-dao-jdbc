package model.dao;

import model.dao.impl.CadcliDaoJDBC;

public class DaoFactory {
	
	public static CadcliDao createCadcliDao1( ) {
		return new CadcliDaoJDBC();
	}

	public static CadcliDao createCadcliDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
