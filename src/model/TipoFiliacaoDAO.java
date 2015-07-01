package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.TipoFiliacao;

public class TipoFiliacaoDAO extends HibernateHelper<TipoFiliacao> implements IDAO<TipoFiliacao> {

	public void save(TipoFiliacao TipoFiliacao) throws Exception {
		TipoFiliacao.setId(RandomHelper.getIntRandom());
		executar(TipoFiliacao);
	}

	public ArrayList<TipoFiliacao> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT tf from TipoFiliacao tf ";
		return  (ArrayList<TipoFiliacao>) consultar(query_string, args);
		
	}

	public TipoFiliacao get(TipoFiliacao obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
