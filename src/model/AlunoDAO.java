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

	public void save(Aluno obj) throws Exception {
		obj.setId(RandomHelper.getIntRandom());
	    executar(obj);
		
	
		
		//Telefone telefone = new Telefone(RandomHelper.getIntRandom(), "95081446");
		//Telefone telefone2 = new Telefone(RandomHelper.getIntRandom(), "89081786");

		
		
	
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
