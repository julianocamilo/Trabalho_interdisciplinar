package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;

import dto.Funcionario;

public class FuncionarioDAO extends HibernateHelper<Funcionario> implements IDAO<Funcionario>{

	private int id_created;
	
	public int getId_created() {
		return this.id_created;
	}
	
	public void save(Funcionario obj) throws Exception {
		this.id_created = RandomHelper.getIntRandom();
		obj.setId(this.id_created);
		executar(obj);
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
