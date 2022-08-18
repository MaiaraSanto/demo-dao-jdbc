package model.dao;

import java.util.List;

import model.entities.Clicad;

public interface ClicadDao {
	
	void insert (Clicad obj);
	void update (Clicad obj);
	void deleteByClicod (Integer Clicod);
	Clicad findByClicod(Integer Clicod);
	List<Clicad> findAll();
}

