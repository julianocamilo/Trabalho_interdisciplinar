package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import dto.Professor;

public class ProfessorDAO extends HibernateHelper<Professor> implements IDAO<Professor>{
	


	private int id_created;
	
	public void setId_created(int id_created) {
		this.id_created = id_created;
	}

	public ArrayList<Professor> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Professor obj) throws Exception {
		this.id_created = RandomHelper.getIntRandom();
		obj.setId(this.id_created);
		executar(obj);
	}

	public Professor get(Professor obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId_created() {
		// TODO Auto-generated method stub
		return this.id_created;
	}

}
