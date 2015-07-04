package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Dia;


public class DiaDAO extends HibernateHelper<Dia> implements IDAO<Dia> {

	public void save(Dia Dia) throws Exception {
		Dia.setId(RandomHelper.getIntRandom());
		executar(Dia);
	}

	public ArrayList<Dia> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT e from Dia e ";
		return  (ArrayList<Dia>) consultar(query_string, args);
		
	}

	public Dia get(Dia obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
