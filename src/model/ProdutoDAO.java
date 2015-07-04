package model;

import helper.HibernateHelper;



import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Produto;


public class ProdutoDAO extends HibernateHelper<Produto> implements IDAO<Produto> {

	public void save(Produto produto) throws Exception {
		produto.setId(RandomHelper.getIntRandom());
		executar(produto);
	}

	public ArrayList<Produto> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Produto i ";
		return  (ArrayList<Produto>) consultar(query_string, args);
		
	}

	
	public ArrayList<Produto> getAvailables() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Produto i WHERE i.quantidade > 0";
		return  (ArrayList<Produto>) consultar(query_string, args);
		
	}
	
	
	public void update(Produto estoque) throws Exception{
		atualizar(estoque);
	}
	
	
	public Produto get(Produto obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
