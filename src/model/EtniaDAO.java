package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Etnia;


public class EtniaDAO extends HibernateHelper<Etnia> implements IDAO<Etnia> {

	public void save(Etnia Etnia) throws Exception {
		Etnia.setId(RandomHelper.getIntRandom());
		executar(Etnia);
	}

	public ArrayList<Etnia> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT e from Etnia e ";
		return  (ArrayList<Etnia>) consultar(query_string, args);
		
	}

	public Etnia get(Etnia obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
