package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import model.IDAO;
import model.ItemDAO;
import dto.Item;

@Stateless
@Local
public class GerenciadorItem {

	private static IDAO<Item> itemDao = new ItemDAO();
	
	public static void salvar(String descricao, double valor) throws Exception{
		if(descricao.isEmpty()) throw new Exception("Descri��o � campo obrigat�rio");
		itemDao.save(new Item(descricao, valor));
		
		
	}
	
	public static ArrayList<Item> listar() throws Exception{
		return itemDao.getAll();
	}
	
	
	public static Item selecionar(int item_id)throws Exception{
		return itemDao.get(new Item(item_id));
	}
	
}
