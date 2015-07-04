package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Horario;


public class HorarioDAO extends HibernateHelper<Horario> implements IDAO<Horario> {

	public void save(Horario Horario) throws Exception {
		Horario.setId(RandomHelper.getIntRandom());
		executar(Horario);
	}

	public ArrayList<Horario> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT e from Horario e ";
		return  (ArrayList<Horario>) consultar(query_string, args);
		
	}

	public Horario get(Horario obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
