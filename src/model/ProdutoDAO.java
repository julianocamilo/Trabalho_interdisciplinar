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
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "UPDATE Item p set p.quantidade = :paramQuantidade WHERE p.id = :paramId";
		
		args.put("paramQuantidade", estoque.getQuantidade());
		args.put("paramId", estoque.getId());
		
		update(query_string, args);
		
		//atualizar(estoque);
	}
	
	
	public Produto get(Produto obj) throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Produto i WHERE i.id = :paramId";
		args.put("paramId", obj.getId());
		ArrayList<Produto> produtos = (ArrayList<Produto>) selecionar(query_string, args);
		if (produtos.isEmpty()) return null;
		return produtos.get(0);
	}
	
	
	
	
	

}
