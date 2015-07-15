package model;

import helper.HibernateHelper;
import helper.RandomHelper;
import java.util.ArrayList;
import java.util.HashMap;
import dto.Aluno;

public class AlunoDAO extends HibernateHelper<Aluno> implements IDAO<Aluno> {

	private int id_created;
	
	public int getId_created() {
		return this.id_created;
	}
	
	public void save(Aluno obj) throws Exception {
		this.id_created = RandomHelper.getIntRandom();
		obj.setId(this.id_created);
	    executar(obj);
	}

	public ArrayList<Aluno> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT e from Aluno e ";
		return  (ArrayList<Aluno>) consultar(query_string, args);
	}

	public Aluno get(Aluno obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
