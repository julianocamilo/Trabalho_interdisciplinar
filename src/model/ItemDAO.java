package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Item;


public class ItemDAO extends HibernateHelper<Item> implements IDAO<Item> {

	public void save(Item Item) throws Exception {
		Item.setId(RandomHelper.getIntRandom());
		executar(Item);
	}

	public ArrayList<Item> getAll() throws Exception {
		HashMap<String, Object> args = new HashMap<String, Object>();
		String query_string = "SELECT i from Item i ";
		return  (ArrayList<Item>) consultar(query_string, args);
		
	}

	public Item get(Item obj) throws Exception {
		return selecionar(obj, obj.getId());
	}
	
	
	
	
	

}
