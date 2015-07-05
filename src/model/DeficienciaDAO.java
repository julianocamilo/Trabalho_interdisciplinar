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
		return selecionar(obj, obj.getId());
	}
}
