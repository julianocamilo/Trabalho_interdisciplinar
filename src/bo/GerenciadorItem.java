package bo;

import java.util.ArrayList;

import model.IDAO;
import model.ItemDAO;
import dto.Item;

public class GerenciadorItem {

	private static IDAO<Item> itemDao = new ItemDAO();
	
	public static void salvar(String descricao, double valor) throws Exception{
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		itemDao.save(new Item(descricao, valor));
		
		
	}
	
	public static ArrayList<Item> listar() throws Exception{
		return itemDao.getAll();
	}
	
	
}
