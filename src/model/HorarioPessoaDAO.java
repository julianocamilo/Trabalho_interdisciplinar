package model;

import helper.HibernateHelper;
import java.util.ArrayList;


import dto.HorarioPessoa;


public class HorarioPessoaDAO extends HibernateHelper<HorarioPessoa> implements IDAO<HorarioPessoa> {

	public void save(HorarioPessoa HorarioPessoa) throws Exception {
		executar(HorarioPessoa);
	}

	public ArrayList<HorarioPessoa> getAll() throws Exception {
		return null;
	}

	public HorarioPessoa get(HorarioPessoa obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
