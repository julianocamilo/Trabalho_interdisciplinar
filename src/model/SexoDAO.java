package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Sexo;
import dto.Usuario;

public class SexoDAO extends HibernateHelper<Sexo> implements IDAO<Sexo> {

	public void save(Sexo sexo) throws Exception {
		sexo.setId(RandomHelper.getIntRandom());
		executar(sexo);
	}

	public ArrayList<Sexo> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT u from Sexo u ";
		return  (ArrayList<Sexo>) consultar(query_string, args);
		
	}

	public Sexo get(Sexo obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
