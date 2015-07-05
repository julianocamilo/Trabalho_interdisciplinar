package model;

import helper.HibernateHelper;
import helper.HibernateUtil;
import helper.RandomHelper;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dto.Aluno;
import dto.Telefone;

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
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno get(Aluno obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
