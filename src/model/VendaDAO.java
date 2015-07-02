package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Venda;


public class VendaDAO extends HibernateHelper<Venda> implements IDAO<Venda> {

	public void save(Venda Venda) throws Exception {
		Venda.setId(RandomHelper.getIntRandom());
		executar(Venda);
	}

	public ArrayList<Venda> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Venda i ";
		return  (ArrayList<Venda>) consultar(query_string, args);
		
	}

	public Venda get(Venda obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
