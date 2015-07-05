package bo;

import java.util.ArrayList;
import java.util.Date;

import model.IDAO;
import model.ItemVendaDAO;
import model.VendaDAO;
import dto.Item;
import dto.ItemVenda;
import dto.Venda;

public class GerenciadorVenda {

	
	private static IDAO<Venda> VendaDao = new VendaDAO();
	private static IDAO<ItemVenda> itemVendaDao = new ItemVendaDAO();
	
	public static void salvar(Date data, double valor, int pessoa_id, ArrayList<Item> itens) throws Exception{
		
		VendaDao.save(new Venda(data, valor,pessoa_id));
		
		
		VendaDAO vdao = (VendaDAO) VendaDao;
		
		int venda_id = vdao.getId_created();
		
		if(itens!=null)
			
			for (Item item : itens) {
				
				ItemVenda itemVenda = new ItemVenda();
				itemVenda.setVenda(new Venda(venda_id));
				itemVenda.setItem(item);
				itemVenda.setValor(item.getValor());
				itemVenda.setQuantidade(item.getQuantidadeSolicitada());
				itemVendaDao.save(itemVenda);
			}
			
			
		
	}
	
	public static ArrayList<Venda> listar() throws Exception{
		return VendaDao.getAll();
	}
	
	public static Venda selecionar(int venda_id)throws Exception{
		return VendaDao.get(new Venda(venda_id));
	}
	
	
}
