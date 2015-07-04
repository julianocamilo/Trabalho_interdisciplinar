package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Curso;


public class CursoDAO extends HibernateHelper<Curso> implements IDAO<Curso> {

	public void save(Curso Curso) throws Exception {
		Curso.setId(RandomHelper.getIntRandom());
		executar(Curso);
	}

	public ArrayList<Curso> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT e from Curso e ";
		return  (ArrayList<Curso>) consultar(query_string, args);
		
	}

	public Curso get(Curso obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
