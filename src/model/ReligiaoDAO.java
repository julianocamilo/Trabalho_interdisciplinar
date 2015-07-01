package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Religiao;

public class ReligiaoDAO extends HibernateHelper<Religiao> implements IDAO<Religiao> {

	public void save(Religiao religiao) throws Exception {
		religiao.setId(RandomHelper.getIntRandom());
		executar(religiao);
	}

	public ArrayList<Religiao> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT r from Religiao r ";
		return  (ArrayList<Religiao>) consultar(query_string, args);
	}


	public Religiao get(Religiao obj) throws Exception {
		// TODO Auto-generated method stub
		return null;

	}

	
	
	
}
