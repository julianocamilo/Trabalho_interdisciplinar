package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import dto.Filiacao;

public class FiliacaoDAO extends HibernateHelper<Filiacao> implements IDAO<Filiacao>{
	


	private int id_created;
	
	

	public void setId_created(int id_created) {
		this.id_created = id_created;
	}

	public ArrayList<Filiacao> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Filiacao obj) throws Exception {
		this.id_created = RandomHelper.getIntRandom();
		obj.setId(this.id_created);
		executar(obj);
	}

	public Filiacao get(Filiacao obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId_created() {
		// TODO Auto-generated method stub
		return this.id_created;
	}

}
