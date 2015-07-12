package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Turma;
import dto.Venda;


public class TurmaDAO extends HibernateHelper<Turma> implements IDAO<Turma> {

	public void save(Turma Turma) throws Exception {
		Turma.setId(RandomHelper.getIntRandom());
		executar(Turma);
	}

	public ArrayList<Turma> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT e from Turma e ";
		return  (ArrayList<Turma>) consultar(query_string, args);
		
	}

	public Turma get(Turma obj) throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Turma i fetch all properties "; // join fetch i.itemvendas WHERE i.id = :paramId";
		ArrayList<Turma> turmas = (ArrayList<Turma>) selecionar(query_string, args);
		if (turmas.isEmpty()) return null;
		return turmas.get(0);
	}
	
	public void update(Turma obj) throws Exception{
		atualizar(obj);
	}
	
	
	

}
