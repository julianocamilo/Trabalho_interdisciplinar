package model;

import helper.HibernateHelper;



import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Servico;


public class ServicoDAO extends HibernateHelper<Servico> implements IDAO<Servico> {

	public void save(Servico Servico) throws Exception {
		Servico.setId(RandomHelper.getIntRandom());
		executar(Servico);
	}

	public ArrayList<Servico> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Servico i ";
		return  (ArrayList<Servico>) consultar(query_string, args);
		
	}

	
	public void update(Servico estoque) throws Exception{
		atualizar(estoque);
	}
	
	
	public Servico get(Servico obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
