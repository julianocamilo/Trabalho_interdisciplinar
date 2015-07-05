package model;

import helper.HibernateHelper;
import java.util.ArrayList;


import dto.ItemVenda;


public class ItemVendaDAO extends HibernateHelper<ItemVenda> implements IDAO<ItemVenda> {

	public void save(ItemVenda ItemVenda) throws Exception {
		executar(ItemVenda);
	}

	public ArrayList<ItemVenda> getAll() throws Exception {
		return null;
	}

	public ItemVenda get(ItemVenda obj) throws Exception {
		return null;
	}
	
	
	
	
	

}
