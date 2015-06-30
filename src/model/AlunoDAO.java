package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;

import dto.Aluno;

public class AlunoDAO extends HibernateHelper<Aluno> implements IDAO<Aluno> {

	public void save(Aluno obj) throws Exception {
		obj.setId(RandomHelper.getIntRandom());
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
