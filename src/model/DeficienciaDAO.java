package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;
import dto.Deficiencia;



public class DeficienciaDAO extends HibernateHelper<Deficiencia> implements IDAO<Deficiencia>{

	public void save(Deficiencia deficiencia) throws Exception {
		deficiencia.setId(RandomHelper.getIntRandom());
		executar(deficiencia);
	}

	public ArrayList<Deficiencia> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT d from Deficiencia d ";
		return  (ArrayList<Deficiencia>) consultar(query_string, args);
	}

	public Deficiencia get(Deficiencia obj) throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Deficiencia i WHERE i.id = :paramId";
		args.put("paramId", obj.getId());
		ArrayList<Deficiencia> d =  (ArrayList<Deficiencia>) selecionar(query_string, args);
		return d.get(0);
	}
}
