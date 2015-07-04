package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Telefone;


public class TelefoneDAO extends HibernateHelper<Telefone> implements IDAO<Telefone> {

	public void save(Telefone Telefone) throws Exception {
		Telefone.setId(RandomHelper.getIntRandom());
		executar(Telefone);
	}

	public ArrayList<Telefone> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Telefone i ";
		return  (ArrayList<Telefone>) consultar(query_string, args);
		
	}
	

	public Telefone get(Telefone obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
