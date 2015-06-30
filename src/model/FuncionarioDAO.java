package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;

import dto.Funcionario;

public class FuncionarioDAO extends HibernateHelper<Funcionario> implements IDAO<Funcionario>{

	public void save(Funcionario obj) throws Exception {
		obj.setId(RandomHelper.getIntRandom());
		executar(obj);
		
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Funcionario> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Funcionario get(Funcionario obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
