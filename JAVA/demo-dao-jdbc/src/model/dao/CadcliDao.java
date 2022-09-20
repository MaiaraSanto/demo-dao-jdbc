package model.dao;

import java.util.List;

import model.entities.Cadcli;

public interface CadcliDao {
	
	void insert (Cadcli obj);
	void update (Cadcli obj);
	void deleteByCodcli (Integer Codcli);
	Cadcli findByCodcli(Integer Codcli);
	List<Cadcli> findAll();
}


