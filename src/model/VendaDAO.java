package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;
import dto.Venda;


public class VendaDAO extends HibernateHelper<Venda> implements IDAO<Venda> {

	private int id_created;
	
	public int getId_created() {
		return id_created;
	}

	public void setId_created(int id_created) {
		this.id_created = id_created;
	}

	public void save(Venda Venda) throws Exception {
		this.id_created = RandomHelper.getIntRandom();
		Venda.setId(this.id_created);
		executar(Venda);
	}

	public ArrayList<Venda> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Venda i";
		return  (ArrayList<Venda>) consultar(query_string, args);
		
	}

	public Venda get(Venda obj) throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Venda i"; // join fetch i.itemvendas WHERE i.id = :paramId";
		//args.put("paramId", obj.getId());
		
		ArrayList<Venda> vendas = (ArrayList<Venda>) selecionar(query_string, args);
		
		if (vendas.isEmpty()) return null;
		
		return vendas.get(0);
	}
	
	
	
	
	

}
