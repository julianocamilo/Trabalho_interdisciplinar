package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Horario;
import dto.Venda;


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
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Horario i"; // join fetch i.itemvendas WHERE i.id = :paramId";
		//args.put("paramId", obj.getId());
		
		ArrayList<Horario> horarios = (ArrayList<Horario>) selecionar(query_string, args);
		
		if (horarios.isEmpty()) return null;
		
		return horarios.get(0);
	}
	
	
	

}
